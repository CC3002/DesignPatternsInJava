package com.cc3002.auxiliar.design.pattern.observer.example04;

public interface IWeatherDataSetter {
  void measurementsChanged();

  void setTemperature(double value);

  void setHumidity(double value);

  void setPressure(double value);
}
