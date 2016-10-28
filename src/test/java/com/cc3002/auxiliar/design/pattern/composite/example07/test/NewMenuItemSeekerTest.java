package com.cc3002.auxiliar.design.pattern.composite.example07.test;

import com.cc3002.auxiliar.design.pattern.composite.example07.MenuEvent;

public class NewMenuItemSeekerTest extends MenuComponentObserverTest {

  @Override
  protected void registerEvent() {
    menu.addObserver(MenuEvent.NEW_ITEM, this::onNewItem);
  }

  @Override
  protected int newItemNotifications() {
    return 1;
  }

  @Override
  protected int newPriceChangeNotifications() {
    return 0;
  }
  
}
