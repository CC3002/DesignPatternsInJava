package com.cc3002.auxiliar.design.pattern.composite.example05.test;

import com.cc3002.auxiliar.design.pattern.composite.example05.MenuComponentObserver;
import com.cc3002.auxiliar.design.pattern.composite.example05.PriceChangeNotification;

public class PriceChangeSeekerTest extends MenuComponentObserverTest {

  @Override
  protected MenuComponentObserver newMenuComponentObserver() {
    return new MenuComponentObserver() {
      @Override
      public void visitPriceChangeNotification(final PriceChangeNotification newItemNotification) {
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
