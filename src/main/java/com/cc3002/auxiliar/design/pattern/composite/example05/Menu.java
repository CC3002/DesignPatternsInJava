package com.cc3002.auxiliar.design.pattern.composite.example05;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Menu extends Observable implements IMenu, Observer {

  private final List<IMenuComponent> items = new ArrayList<IMenuComponent>(); 
  
  @Override
  public void addItem(final IMenuComponent menuItem) {
    menuItem.addObserver(this);
    items.add(menuItem);
    this.setChanged();
    this.notifyObservers(new NewItemNotification(menuItem));
  }

  @Override
  public long size() {
    return items.size();
  }

  @Override
  public void update(final Observable menuItem, final Object notification) {
    this.setChanged();
    this.notifyObservers(notification);
  }

}
