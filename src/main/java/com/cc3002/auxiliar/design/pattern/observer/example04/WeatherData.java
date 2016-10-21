package com.cc3002.auxiliar.design.pattern.observer.example04;

import java.util.Observable;

public class WeatherData extends Observable implements IWeatherDataSetter, IWeatherDataGetter {

  private double humidity;
  private double temperature;
  private double pressure;

  public void measurementsChanged() {
    this.notifyObservers();
  }

  public void setTemperature(final double value) {
    temperature = value;
    this.setChanged();
  }

  public void setHumidity(final double value) {
    humidity = value;
    this.setChanged();
  }

  public void setPressure(final double value) {
    pressure = value;
    this.setChanged();
  }

  public double getHumidity() {
    return humidity;
  }

  public double getPressure() {
    return pressure;
  }

  public double getTemperature() {
    return temperature;
  }

}
