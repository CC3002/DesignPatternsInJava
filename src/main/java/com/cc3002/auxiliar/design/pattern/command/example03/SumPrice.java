package com.cc3002.auxiliar.design.pattern.command.example03;

public class SumPrice implements ICommand, IVisitor {

  private double price;

  @Override
  public void execute(final IMenuComponent menu) {
    menu.accept(this);
  }

  public double getPrice() {
    return price;
  }

  @Override
  public void visitMenu(final IMenu menu) {
    menu.forEach(each -> each.accept(this));
  }

  @Override
  public void visitMenuItem(final IMenuItem menuItem) {
    price += menuItem.getPrice();
  }

}
