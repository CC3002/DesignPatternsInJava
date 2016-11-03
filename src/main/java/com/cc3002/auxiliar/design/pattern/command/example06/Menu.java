package com.cc3002.auxiliar.design.pattern.command.example06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements IMenu {

  private final List<IMenuComponent> items = new ArrayList<IMenuComponent>(); 
  
  @Override
  public void addItem(final IMenuComponent menuItem) {
    items.add(menuItem);
  }

  @Override
  public long size() {
    return items.size();
  }

  @Override
  public void accept(final IVisitor visitor) {
    visitor.visitMenu(this);
  }

  @Override
  public Iterator<IMenuComponent> iterator() {
    return items.iterator();
  }

}
