package com.cc3002.auxiliar.design.pattern.composite.example06;

import java.util.ArrayList;
import java.util.List;

public class MenuItem implements IMenuItem {

  private static final double PRICE_DIFFERENCE = 0.001d;
  private final String name;
  private final String description;
  private final boolean vegetarian;
  private double price;
  private final List<IMenuComponentObserver> observers = new ArrayList<IMenuComponentObserver>();

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
  public void setPrice(final double newPrice) {
    if (Math.abs(this.price - newPrice) > PRICE_DIFFERENCE) {
      final double oldPrice = this.price;
      this.price = newPrice;
      this.notifyPriceChange(oldPrice, newPrice);
    }
  }

  private void notifyPriceChange(final double oldPrice, final double newPrice) {
    observers.forEach(each -> each.priceChangeNotification(this, oldPrice, newPrice));
  }

  @Override
  public void addObserver(final IMenuComponentObserver observer) {
    observers.add(observer);
  }

}
