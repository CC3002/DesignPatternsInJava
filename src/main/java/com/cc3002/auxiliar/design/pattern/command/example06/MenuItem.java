package com.cc3002.auxiliar.design.pattern.command.example06;

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
  public void accept(final IVisitor visitor) {
    visitor.visitMenuItem(this);
  }

}
