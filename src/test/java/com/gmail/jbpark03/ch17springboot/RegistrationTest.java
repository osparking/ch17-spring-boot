package com.gmail.jbpark03.ch17springboot;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;

import com.gmail.jbpark03.ch17springboot.model.Passenger;
import com.gmail.jbpark03.ch17springboot.regis.PassengerRegistrationEvent;
import com.gmail.jbpark03.ch17springboot.regis.RegistrationManager;

@SpringBootTest
@EnableAutoConfiguration
@ImportResource("classpath:application-context.xml")
class RegistrationTest {

  @Autowired
  private RegistrationManager manager;

  @Autowired
  private Passenger passenger;

  @Test
  void test() {
    var event = new PassengerRegistrationEvent(passenger);
    System.out.println("사건 발생 후:" + passenger);
    manager.getApplicationContext().publishEvent(event);
    assertTrue(passenger.isRegistered());
  }
}
