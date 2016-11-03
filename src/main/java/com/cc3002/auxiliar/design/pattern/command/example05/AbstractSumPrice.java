package com.cc3002.auxiliar.design.pattern.command.example05;

public abstract class AbstractSumPrice implements ICommand, IVisitor {

  protected double price;

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
  public abstract void visitMenuItem(final IMenuItem menuItem);

}
