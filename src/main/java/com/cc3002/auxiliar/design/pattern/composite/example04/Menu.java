package com.cc3002.auxiliar.design.pattern.composite.example04;

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
    this.notifyObservers(menuItem);
  }

  @Override
  public long size() {
    return items.size();
  }

  @Override
  public void update(final Observable menuItem, final Object arg) {
    this.setChanged();
    this.notifyObservers(menuItem);
  }

}
