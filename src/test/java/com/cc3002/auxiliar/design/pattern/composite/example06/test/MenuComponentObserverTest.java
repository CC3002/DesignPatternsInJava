package com.cc3002.auxiliar.design.pattern.composite.example06.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.composite.example06.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuComponentObserver;
import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example06.Menu;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuComponentObserver;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class MenuComponentObserverTest {

  protected IMenuComponentObserver observer;
  protected IMenu menu;
  protected IMenuItem item;
  protected int results;

  /**
   * Initialize test case.
   */
  @Before
  public void setUp() {
    observer = newMenuComponentObserver();
    menu = new Menu();
    item = new MenuItem("a", "b", true, 1);
  }

  protected MenuComponentObserver newMenuComponentObserver() {
    return new MenuComponentObserver();
  }

  protected int newItemNotifications() {
    return 0;
  }

  protected int newPriceChangeNotifications() {
    return 0;
  }

  @Test
  public void testNewItemNotification() {
    menu.addObserver(observer);
    menu.addItem(new MenuItem("c", "d", true, 1.5));
    assertEquals("Different notification.", newItemNotifications(), results);
  }

  @Test
  public void testPriceChangeNotification() {
    menu.addItem(item);
    menu.addObserver(observer);
    item.setPrice(0.5);
    assertEquals("Different notification.", newPriceChangeNotifications(), results);
  }

}
