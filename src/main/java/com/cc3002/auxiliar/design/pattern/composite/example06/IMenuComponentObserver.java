package com.cc3002.auxiliar.design.pattern.composite.example06;

public interface IMenuComponentObserver {

  void priceChangeNotification(IMenuItem item, double oldPrice, double newPrice);

  void newItemNotification(IMenu menu, IMenuComponent component);

}
