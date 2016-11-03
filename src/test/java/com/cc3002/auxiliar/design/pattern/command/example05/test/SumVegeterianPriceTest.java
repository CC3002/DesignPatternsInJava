package com.cc3002.auxiliar.design.pattern.command.example05.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.command.example05.IMenu;
import com.cc3002.auxiliar.design.pattern.command.example05.IMenuItem;
import com.cc3002.auxiliar.design.pattern.command.example05.Menu;
import com.cc3002.auxiliar.design.pattern.command.example05.MenuItem;
import com.cc3002.auxiliar.design.pattern.command.example05.SumVegeterianPrice;

import org.junit.Before;
import org.junit.Test;

public class SumVegeterianPriceTest {

  private static final double DOUBLE_PRECISION = 0.000001d;
  private SumVegeterianPrice command;
  private IMenu menu;
  private IMenuItem itemOne;
  private MenuItem itemTwo;

  /**
   * Initialize test cases.
   */
  @Before
  public void setUp() {
    command = new SumVegeterianPrice();
    menu = new Menu();
    itemOne = new MenuItem("a", "b", true, 1.3);
    itemTwo = new MenuItem("c", "d", false, 3.4);
  }

  @Test
  public void testItemOnePrice() {
    command.execute(itemOne);
    assertEquals("Expects exact price.", 1.3, command.getPrice(), DOUBLE_PRECISION);
  }

  @Test
  public void testItemTwoPrice() {
    command.execute(itemTwo);
    assertEquals("Expects exact price.", 0d, command.getPrice(), DOUBLE_PRECISION);
  }

  @Test
  public void testMenuPrice() {
    menu.addItem(itemOne);
    menu.addItem(itemTwo);
    command.execute(menu);
    assertEquals("Expects exact price.", 1.3, command.getPrice(), DOUBLE_PRECISION);
  }

}
