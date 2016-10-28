package com.cc3002.auxiliar.design.pattern.composite.example06;

public class MenuComponentObserver implements IMenuComponentObserver {

  @Override
  public void priceChangeNotification(final IMenuItem item, final double oldPrice,
      final double newPrice) {
    /* do nothing */
  }

  @Override
  public void newItemNotification(final IMenu menu, final IMenuComponent component) {
    /* do nothing */
  }

}
