package com.cc3002.auxiliar.design.pattern.command.example02.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.command.example02.IMenu;
import com.cc3002.auxiliar.design.pattern.command.example02.IMenuItem;
import com.cc3002.auxiliar.design.pattern.command.example02.Menu;
import com.cc3002.auxiliar.design.pattern.command.example02.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class SumPriceTest {

  private static final double DOUBLE_PRECISION = 0.000001d;
  private IMenu menu;
  private IMenuItem itemOne;
  private MenuItem itemTwo;

  /**
   * Initialize test cases.
   */
  @Before
  public void setUp() {
    menu = new Menu();
    itemOne = new MenuItem("a", "b", true, 1.3);
    itemTwo = new MenuItem("c", "d", false, 3.4);
  }

  @Test
  public void testItemOnePrice() {
    assertEquals("Expects exact price.", 1.3, itemOne.getPrice(), DOUBLE_PRECISION);
  }

  @Test
  public void testItemTwoPrice() {
    assertEquals("Expects exact price.", 3.4, itemTwo.getPrice(), DOUBLE_PRECISION);
  }

  @Test
  public void testMenuPrice() {
    menu.addItem(itemOne);
    menu.addItem(itemTwo);
    assertEquals("Expects exact price.", 4.7, menu.getPrice(), DOUBLE_PRECISION);
  }
}
