package com.cc3002.auxiliar.design.pattern.observer.example02;

public class WeatherData implements IWeatherDataSetter, IWeatherDataGetter {

  private double humidity;
  private double temperature;
  private double pressure;

  public void measurementsChanged() {
    // TODO Auto-generated method stub

  }

  public void setTemperature(final double value) {
    temperature = value;
  }

  public void setHumidity(final double value) {
    humidity = value;
  }

  public void setPressure(final double value) {
    pressure = value;
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
