package com.cc3002.auxiliar.design.pattern.composite.example06.test;

import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuComponentObserver;

public class PriceChangeSeekerTest extends MenuComponentObserverTest {

  @Override
  protected MenuComponentObserver newMenuComponentObserver() {
    return new MenuComponentObserver() {
      @Override
      public void priceChangeNotification(final IMenuItem item, final double oldPrice,
          final double newPrice) {
        results += 1;
      }
    };
  }

  @Override
  protected int newItemNotifications() {
    return 0;
  }

  @Override
  protected int newPriceChangeNotifications() {
    return 1;
  }

}
