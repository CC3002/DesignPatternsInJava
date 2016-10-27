package com.cc3002.auxiliar.design.pattern.composite.example05.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.composite.example05.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example05.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example05.Menu;
import com.cc3002.auxiliar.design.pattern.composite.example05.MenuItem;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

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
    menu.addObserver(new Observer() {

      @Override
      public void update(final Observable observable, final Object arg) {
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
    menu.addObserver(new Observer() {

      @Override
      public void update(final Observable observable, final Object arg) {
        results += 1;
      }
    });
    menu.addItem(new MenuItem("c", "d", true, 1.5));
    assertEquals("Expects new item notification.", 1, results);
  }

}
