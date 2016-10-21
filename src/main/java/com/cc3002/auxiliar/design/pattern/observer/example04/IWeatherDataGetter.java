package com.cc3002.auxiliar.design.pattern.observer.example04;

import java.util.Observer;

public interface IWeatherDataGetter {

  double getHumidity();

  double getPressure();

  double getTemperature();
  
  void addObserver(Observer observer);
  
  void deleteObserver(Observer observer);

}
