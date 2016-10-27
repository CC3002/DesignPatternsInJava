package com.cc3002.auxiliar.design.pattern.composite.example03;

import java.util.Observable;

public class MenuItem extends Observable implements IMenuItem {

  private final String name;
  private final String description;
  private final boolean vegetarian;
  private double price;

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
    super();
    this.name = name;
    this.description = description;
    this.vegetarian = vegeterian;
    this.price = price;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public void setPrice(final double price) {
    if (Math.abs(this.price - price) > 0.001d) {
      this.setChanged();
    }
    this.price = price;
    this.notifyObservers();
  }

}
