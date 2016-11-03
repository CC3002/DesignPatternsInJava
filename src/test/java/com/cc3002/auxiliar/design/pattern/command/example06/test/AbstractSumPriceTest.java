package com.cc3002.auxiliar.design.pattern.command.example06.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.command.example06.AbstractSumPrice;
import com.cc3002.auxiliar.design.pattern.command.example06.IMenu;
import com.cc3002.auxiliar.design.pattern.command.example06.IMenuItem;
import com.cc3002.auxiliar.design.pattern.command.example06.Menu;
import com.cc3002.auxiliar.design.pattern.command.example06.MenuItem;

import org.junit.Before;
import org.junit.Test;

public abstract class AbstractSumPriceTest {

  private static final double DOUBLE_PRECISION = 0.000001d;
  private AbstractSumPrice command;
  private IMenu menu;
  private IMenuItem itemOne;
  private MenuItem itemTwo;

  /**
   * Initialize test cases.
   */
  @Before
  public void setUp() {
    command = newCommand();
    menu = new Menu();
    itemOne = new MenuItem("a", "b", true, 1.3);
    itemTwo = new MenuItem("c", "d", false, 3.4);
  }

  protected abstract AbstractSumPrice newCommand();

  @Test
  public void testItemOnePrice() {
    command.execute(itemOne);
    assertEquals("Expects exact price.", priceItemOne(), command.getPrice(), DOUBLE_PRECISION);
  }

  protected double priceItemOne() {
    return 1.3;
  }

  @Test
  public void testItemTwoPrice() {
    command.execute(itemTwo);
    assertEquals("Expects exact price.", priceItemTwo(), command.getPrice(), DOUBLE_PRECISION);
  }

  protected double priceItemTwo() {
    return 3.4;
  }

  @Test
  public void testMenuPrice() {
    menu.addItem(itemOne);
    menu.addItem(itemTwo);
    command.execute(menu);
    assertEquals("Expects exact price.", priceMenu(), command.getPrice(), DOUBLE_PRECISION);
  }

  protected double priceMenu() {
    return 4.7;
  }

}
