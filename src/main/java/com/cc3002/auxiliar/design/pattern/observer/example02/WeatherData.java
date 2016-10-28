package com.cc3002.auxiliar.design.pattern.observer.example02;

public class WeatherData implements IWeatherDataSetter, IWeatherDataGetter {

  private double humidity;
  private double temperature;
  private double pressure;

  @Override
  public void measurementsChanged() {
    /* we should do something here */
  }

  @Override
  public void setTemperature(final double value) {
    temperature = value;
  }

  @Override
  public void setHumidity(final double value) {
    humidity = value;
  }

  @Override
  public void setPressure(final double value) {
    pressure = value;
  }

  @Override
  public double getHumidity() {
    return humidity;
  }

  @Override
  public double getPressure() {
    return pressure;
  }

  @Override
  public double getTemperature() {
    return temperature;
  }

}
