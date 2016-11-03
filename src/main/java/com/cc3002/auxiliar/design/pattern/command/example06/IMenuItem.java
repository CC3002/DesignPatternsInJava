package com.cc3002.auxiliar.design.pattern.command.example06;

public interface IMenuItem extends IMenuComponent {

  String getName();

  String getDescription();

  double getPrice();

  boolean isVegetarian();

}
