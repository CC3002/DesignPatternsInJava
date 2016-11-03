package com.cc3002.auxiliar.design.pattern.command.example06.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.command.example06.IMenu;
import com.cc3002.auxiliar.design.pattern.command.example06.Menu;
import com.cc3002.auxiliar.design.pattern.command.example06.MenuItem;

import org.junit.Before;
import org.junit.Test;

public class MenuTest {

  private IMenu menu;

  @Before
  public void setUp() {
    menu = new Menu();
    
  }

  @Test
  public void testSize() {
    assertEquals("Expects empty menu.", 0, menu.size());
  }

  @Test
  public void testAddMenuItem() {
    menu.addItem(new MenuItem("a", "b", true, 1));
    assertEquals("Expects one item", 1, menu.size());
  }

  @Test
  public void testAddSubMenu() {
    menu.addItem(new Menu());
    assertEquals("Expects one item", 1, menu.size());
  }

}
