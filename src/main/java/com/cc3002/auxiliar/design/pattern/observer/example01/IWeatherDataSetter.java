package com.cc3002.auxiliar.design.pattern.observer.example01;

public interface IWeatherDataSetter {
  void measurementsChanged();

  void setTemperature(float value);

  void setHumidity(float value);

  void setPressure(float value);
}
