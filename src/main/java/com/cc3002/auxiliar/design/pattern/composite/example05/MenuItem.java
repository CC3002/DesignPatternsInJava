package com.cc3002.auxiliar.design.pattern.composite.example05;

import java.util.Observable;

public class MenuItem extends Observable implements IMenuItem {

  private static final double PRICE_DIFFERENCE = 0.001d;
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
    if (Math.abs(this.price - price) > PRICE_DIFFERENCE) {
      this.setChanged();
    }
    final double oldPrice = this.price;
    this.price = price;
    this.notifyObservers(new PriceChangeNotification(this, oldPrice, price));
  }

}
