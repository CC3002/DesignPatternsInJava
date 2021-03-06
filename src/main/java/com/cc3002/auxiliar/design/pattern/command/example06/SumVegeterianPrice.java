package com.cc3002.auxiliar.design.pattern.command.example06;

public class SumVegeterianPrice extends AbstractSumPrice {

  private double price;

  @Override
  public void execute(final IMenuComponent menu) {
    menu.accept(this);
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void visitMenu(final IMenu menu) {
    menu.forEach(each -> each.accept(this));
  }

  @Override
  public void visitMenuItem(final IMenuItem menuItem) {
    if (menuItem.isVegetarian()) {
      price += menuItem.getPrice();
    }
  }

}
