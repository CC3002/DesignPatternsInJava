package com.cc3002.auxiliar.design.pattern.composite.example02;

public interface IMenu extends IMenuComponent {

  long size();

  void addItem(IMenuComponent menuItem);

}
