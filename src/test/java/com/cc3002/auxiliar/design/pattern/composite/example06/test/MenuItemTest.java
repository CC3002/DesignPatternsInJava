package com.cc3002.auxiliar.design.pattern.composite.example06.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.cc3002.auxiliar.design.pattern.composite.example06.IMenuItem;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuComponentObserver;
import com.cc3002.auxiliar.design.pattern.composite.example06.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class MenuItemTest {

  private String name;
  private String description;
  private double price;
  private IMenuItem item;
  private int results;


  /**
   * Initialize test case.
   */
  @Before
  public void setUp() {
    name = "Item name";
    description = "Item description";
    price = 3.47;
    item = new MenuItem(name, description, true, price);
  }

  @Test
  public void testGetName() {
    assertEquals("Expects same name", name, item.getName());
  }

  @Test
  public void testGetDescription() {
    assertEquals("Expects same description", description, item.getDescription());
  }

  @Test
  public void testPrice() {
    assertEquals("Expects same price", price, item.getPrice(), 0.0d);
  }

  @Test
  public void testIsVegetarianYes() {
    assertTrue("Expects vegetarian item", item.isVegetarian());
  }

  @Test
  public void testIsVegetarianNo() {
    assertFalse("Expects not vegetarian item",
        new MenuItem(name, description, false, price).isVegetarian());
  }

  @Test
  public void testSetPrice() {
    item.setPrice(2.0);
    assertEquals("Expects new price", 2.0, item.getPrice(), 0.0d);
  }

  @Test
  public void testNotifyPriceChange() {
    item.addObserver(new MenuComponentObserver() {

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
}
