package com.cc3002.auxiliar.design.pattern.observer.example03;

public interface IWeatherDataGetter {

  double getHumidity();

  double getPressure();

  double getTemperature();

  void addDisplay(IDisplay display);

}
