package com.cc3002.auxiliar.design.pattern.composite.example03.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.composite.example03.IMenu;
import com.cc3002.auxiliar.design.pattern.composite.example03.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example03.Menu;
import com.cc3002.auxiliar.design.pattern.composite.example03.MenuItem;

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
    assertEquals("Expects price change.", 1, results);
  }

}
