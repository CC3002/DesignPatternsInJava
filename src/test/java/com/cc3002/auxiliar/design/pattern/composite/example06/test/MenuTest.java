package com.cc3002.auxiliar.design.pattern.composite.example06.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.composite.example06.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuComponent;
import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example06.Menu;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuComponentObserver;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class MenuTest {

  private IMenu menu;
  private int results;
  private IMenuItem item;

  @Before
  public void setUp() {
    menu = new Menu();
    item = new MenuItem("a", "b", true, 1);
  }

  @Test
  public void testSize() {
    assertEquals("Expects empty menu.", 0, menu.size());
  }

  @Test
  public void testAddMenuItem() {
    menu.addItem(item);
    assertEquals("Expects one item", 1, menu.size());
  }

  @Test
  public void testAddSubMenu() {
    menu.addItem(new Menu());
    assertEquals("Expects one item", 1, menu.size());
  }

  @Test
  public void testNotifyPriceChange() {
    menu.addItem(item);
    menu.addObserver(new MenuComponentObserver() {

      @Override
      public void priceChangeNotification(final IMenuItem item, final double oldPrice,
          final double newPrice) {
        results += 1;
      }

    });
    item.setPrice(2.0);
    assertEquals("Expects price change notification.", 1, results);
  }

  @Test
  public void testNoPriceChange() {
    testNotifyPriceChange();
    item.setPrice(2.0);
    assertEquals("Expects price change notification.", 1, results);
  }

  @Test
  public void testNotifyNewItem() {
    menu.addObserver(new MenuComponentObserver() {

      @Override
      public void newItemNotification(final IMenu menu, final IMenuComponent component) {
        results += 1;
      }

    });
    menu.addItem(new MenuItem("c", "d", true, 1.5));
    assertEquals("Expects new item notification.", 1, results);
  }

}
