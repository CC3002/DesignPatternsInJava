package com.cc3002.auxiliar.design.pattern.composite.example01;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

  private final List<IMenuItem> items = new ArrayList<IMenuItem>(); 
  
  public void addItem(final IMenuItem menuItem) {
    items.add(menuItem);
  }

  public long size() {
    return items.size();
  }

}
