package com.gmail.jbpark03.ch17springboot.regis;

import org.springframework.context.ApplicationEvent;

import com.gmail.jbpark03.ch17springboot.model.Passenger;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class PassengerRegistrationEvent extends ApplicationEvent {
  private Passenger passenger;

  public PassengerRegistrationEvent(Passenger passenger) {
    super(passenger);
    this.passenger = passenger;
  }
}
