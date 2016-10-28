package com.cc3002.auxiliar.design.pattern.composite.example07.test;

import com.cc3002.auxiliar.design.pattern.composite.example07.MenuEvent;

public class PriceChangeSeekerTest extends MenuComponentObserverTest {

  @Override
  protected void registerEvent() {
    menu.addObserver(MenuEvent.PRICE_CHANGE, this::onPriceChange);    
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
