package com.gmail.jbpark03.ch17springboot.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
public class Passenger {
  private String name;
  private Country country;
  private boolean registered;

  public Passenger(String name) {
    super();
    this.name = name;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public void setRegistered(boolean registered) {
    this.registered = registered;
  }
}
