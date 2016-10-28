package com.cc3002.auxiliar.design.pattern.composite.example06;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu, IMenuComponentObserver {

  private final List<IMenuComponent> items = new ArrayList<IMenuComponent>();
  private final List<IMenuComponentObserver> observers = new ArrayList<IMenuComponentObserver>();

  @Override
  public void addItem(final IMenuComponent menuItem) {
    menuItem.addObserver(this);
    items.add(menuItem);
    this.notifyNewItem(menuItem);
  }

  private void notifyNewItem(final IMenuComponent menuItem) {
    observers.forEach(each -> each.newItemNotification(this, menuItem));
  }

  @Override
  public long size() {
    return items.size();
  }

  @Override
  public void addObserver(final IMenuComponentObserver observer) {
    observers.add(observer);
  }

  @Override
  public void priceChangeNotification(final IMenuItem item, final double oldPrice,
      final double newPrice) {
    observers.forEach(each -> each.priceChangeNotification(item, oldPrice, newPrice));
  }

  @Override
  public void newItemNotification(final IMenu menu, final IMenuComponent component) {
    observers.forEach(each -> each.newItemNotification(menu, component));
  }

}
