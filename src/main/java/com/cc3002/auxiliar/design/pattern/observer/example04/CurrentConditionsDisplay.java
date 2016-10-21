package com.cc3002.auxiliar.design.pattern.observer.example04;

import java.io.PrintStream;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

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
   * @param observable weather data object
   * @param arg is not used here
   */
  @Override
  public void update(final Observable observable, final Object arg) {
    final IWeatherDataGetter data = (IWeatherDataGetter) observable;
    update(data.getTemperature(), data.getPressure(), data.getHumidity());
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
