package com.cc3002.auxiliar.design.pattern.command.example04.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.cc3002.auxiliar.design.pattern.command.example04.IMenuItem;
import com.cc3002.auxiliar.design.pattern.command.example04.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class MenuItemTest {

  private String name;
  private String description;
  private double price;
  private IMenuItem item;

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
}
