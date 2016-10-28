package com.cc3002.auxiliar.design.pattern.composite.example06.test;

import com.cc3002.auxiliar.design.pattern.composite.example06.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuComponent;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuComponentObserver;

public class NewMenuItemSeekerTest extends MenuComponentObserverTest {

  @Override
  protected MenuComponentObserver newMenuComponentObserver() {
    return new MenuComponentObserver() {
      @Override
      public void newItemNotification(final IMenu menu, final IMenuComponent component) {
        results += 1;
      }
    };
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
