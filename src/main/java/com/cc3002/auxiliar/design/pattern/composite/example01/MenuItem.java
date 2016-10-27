package com.cc3002.auxiliar.design.pattern.composite.example01;

public class MenuItem implements IMenuItem {

  private final String name;
  private final String description;
  private final boolean vegetarian;
  private final double price;

  /**
   * Creates a menu item.
   * 
   * @param name menu item name
   * @param description of the menu item
   * @param vegeterian identifies vegetarian menu item
   * @param price defines menu item price
   */
  public MenuItem(final String name, final String description, final boolean vegeterian,
      final double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegeterian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

}
