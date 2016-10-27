package com.cc3002.auxiliar.design.pattern.composite.example04.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.composite.example04.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example04.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example04.Menu;
import com.cc3002.auxiliar.design.pattern.composite.example04.MenuItem;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

public class PriceChangeSeekerTest {

  private IMenu menu;
  private IMenuItem item;
  private int results;

  /** 
   * Initialize test.
   */
  @Before
  public void setUp() {
    menu = new Menu();
    item = new MenuItem("a", "b", true, 1);
    menu.addItem(item);
  }

  @Test
  public void testPriceChangeNotification() {
    menu.addObserver(new Observer() {

      @Override
      public void update(final Observable observable, final Object arg) {
        results += 1;
      }
    });
    item.setPrice(0.5);
    assertEquals("Expects price change notification.", 1, results);
  }

  @Test
  public void testDoNotReceiveNewItemNotification() {
    menu.addObserver(new Observer() {

      @Override
      public void update(final Observable observable, final Object arg) {
        results += 1;
      }
    });
    menu.addItem(new MenuItem("c", "d", true, 1.5));
    /* we prefer not to be notified, but current solution does not reflect it */
    assertEquals("Unexpected price change notification.", 1, results);
  }

}
