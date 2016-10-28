package com.cc3002.auxiliar.design.pattern.composite.example06;

public interface IMenuItem extends IMenuComponent {

  String getName();

  String getDescription();

  double getPrice();

  boolean isVegetarian();

  void setPrice(double price);

}
