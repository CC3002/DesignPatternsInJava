package com.cc3002.auxiliar.design.pattern.command.example06.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.cc3002.auxiliar.design.pattern.command.example06.IMenu;
import com.cc3002.auxiliar.design.pattern.command.example06.IMenuItem;
import com.cc3002.auxiliar.design.pattern.command.example06.Menu;
import com.cc3002.auxiliar.design.pattern.command.example06.MenuItem;
import com.cc3002.auxiliar.design.pattern.command.example06.OneVegetarianMenu;

import org.junit.Before;
import org.junit.Test;

public class FindVegeterianMenuTest {

  private OneVegetarianMenu command;
  private IMenu menu;
  private IMenuItem itemOne;
  private MenuItem itemTwo;

  /**
   * Initialize test cases.
   */
  @Before
  public void setUp() {
    command = new OneVegetarianMenu();
    menu = new Menu();
    itemOne = new MenuItem("a", "b", true, 1.3);
    itemTwo = new MenuItem("c", "d", false, 3.4);
  }

  @Test
  public void testItemOneVegetarian() {
    command.execute(itemOne);
    assertEquals("Expects item one.", itemOne, command.getMenu());
  }

  @Test
  public void testItemTwoNoVegetarian() {
    command.execute(itemTwo);
    assertNull("Expects no menu.", command.getMenu());
  }

  @Test
  public void testMenuWithVegetarianItemOne() {
    menu.addItem(itemOne);
    menu.addItem(itemTwo);
    command.execute(menu);
    assertEquals("Expects menu item one.", itemOne, command.getMenu());
  }

  @Test
  public void testMenuNoVegetarian() {
    menu.addItem(itemTwo);
    command.execute(menu);
    assertNull("Expects no menu.", command.getMenu());
  }

  @Test
  public void testMenuVegetarian() {
    menu.addItem(itemOne);
    command.execute(menu);
    assertEquals("Expects menu.", menu, command.getMenu());
  }
}
