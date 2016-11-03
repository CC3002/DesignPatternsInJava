package com.cc3002.auxiliar.design.pattern.command.example04;

public interface IMenu extends IMenuComponent, Iterable<IMenuComponent> {

  long size();

  void addItem(IMenuComponent menuItem);

}
