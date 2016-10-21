package com.cc3002.auxiliar.design.pattern.observer.example03;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IWeatherDataSetter, IWeatherDataGetter {

  private double humidity;
  private double temperature;
  private double pressure;
  private final List<IDisplay> displays = new ArrayList<IDisplay>();

  public void measurementsChanged() {
    displays.forEach(eachDisplay -> eachDisplay.update(temperature, pressure, humidity));
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

  public void addDisplay(final IDisplay display) {
    displays.add(display);
  }

}
