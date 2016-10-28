package com.cc3002.auxiliar.design.pattern.composite.example07;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;

public class MenuItem implements IMenuItem {

  private static final double PRICE_DIFFERENCE = 0.001d;
  private final String name;
  private final String description;
  private final boolean vegetarian;
  private double price;
  private final Group observers = new Group();

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
      this.price = newPrice;
      this.notifyPriceChange();
    }
  }

  private void notifyPriceChange() {
    observers.fireEvent(new MenuEvent(MenuEvent.PRICE_CHANGE));
  }

  @Override
  public void addObserver(final EventType<MenuEvent> eventType,
      final EventHandler<? super MenuEvent> eventHandler) {
    observers.addEventHandler(eventType, eventHandler);
  }

}
