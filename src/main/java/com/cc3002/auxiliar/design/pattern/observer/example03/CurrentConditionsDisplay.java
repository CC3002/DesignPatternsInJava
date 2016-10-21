package com.cc3002.auxiliar.design.pattern.observer.example03;

import java.io.PrintStream;

public class CurrentConditionsDisplay implements IDisplay {

  private PrintStream stream = System.out;
  private double temperature;
  private double pressure;
  private double humidity;

  public void setStream(final PrintStream printStream) {
    stream = printStream;
  }

  public PrintStream getStream() {
    return stream;
  }

  /** 
   * This method is called whenever there is a change in any value.
   *  
   * @param temperature current temperature
   * @param pressure current pressure
   * @param humidity current humidity
   */
  public void update(final double temperature, final double pressure, final double humidity) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    display();
  }

  /**
   * Write current conditions to a stream. 
   */
  public void display() {
    stream.print("Current conditions: ");
    stream.print(String.format("%1$.0f", temperature));
    stream.print(" C degrees, ");
    stream.print(String.format("%1$.0f", pressure));
    stream.print(" hPa, ");
    stream.print(String.format("%1$.0f", humidity));
    stream.println("% humidity.");
  }

}
