package com.gmail.jbpark03.ch17springboot.regis;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.gmail.jbpark03.ch17springboot.model.Passenger;

@Service
public class PassengerRegistrationListener {
  @EventListener
  public void confirmRegistration (PassengerRegistrationEvent event) {
    Passenger passenger = event.getPassenger(); 
    passenger.setRegistered(true);
    System.out.println("등록된 승객: " + passenger);
  }
}
