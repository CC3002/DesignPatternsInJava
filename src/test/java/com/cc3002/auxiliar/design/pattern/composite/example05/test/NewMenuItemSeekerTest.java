package com.cc3002.auxiliar.design.pattern.composite.example05.test;

import com.cc3002.auxiliar.design.pattern.composite.example05.MenuComponentObserver;
import com.cc3002.auxiliar.design.pattern.composite.example05.NewItemNotification;

public class NewMenuItemSeekerTest extends MenuComponentObserverTest {

  @Override
  protected MenuComponentObserver newMenuComponentObserver() {
    return new MenuComponentObserver() {
      @Override
      public void visitNewItemNotification(final NewItemNotification notification) {
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
