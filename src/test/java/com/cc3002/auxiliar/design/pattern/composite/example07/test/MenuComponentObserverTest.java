package com.cc3002.auxiliar.design.pattern.composite.example07.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.composite.example07.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example07.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example07.Menu;
import com.cc3002.auxiliar.design.pattern.composite.example07.MenuEvent;
import com.cc3002.auxiliar.design.pattern.composite.example07.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class MenuComponentObserverTest {

  protected IMenu menu;
  protected IMenuItem item;
  protected int priceChanges;
  protected int newItems;

  /**
   * Initialize test case.
   */
  @Before
  public void setUp() {
    menu = new Menu();
    item = new MenuItem("a", "b", true, 1);
    registerEvent();
  }

  protected void registerEvent() {
    menu.addObserver(MenuEvent.NEW_ITEM, this::onNewItem);
    menu.addObserver(MenuEvent.PRICE_CHANGE, this::onPriceChange);    
  }

  protected int newItemNotifications() {
    return 1;
  }

  protected int newPriceChangeNotifications() {
    return 1;
  }

  public void onNewItem(final MenuEvent event) {
    newItems += 1;
  }

  public void onPriceChange(final MenuEvent event) {
    priceChanges += 1;
  }

  @Test
  public void testNewItemNotification() {
    menu.addItem(new MenuItem("c", "d", true, 1.5));
    assertEquals("Different notification.", newItemNotifications(), newItems);
  }
  
  @Test
  public void testPriceChangeNotification() {
    menu.addItem(item);
    item.setPrice(0.5);
    assertEquals("Different notification.", newPriceChangeNotifications(), priceChanges);
  }

}
