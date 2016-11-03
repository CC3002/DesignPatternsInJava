package com.cc3002.auxiliar.design.pattern.command.example06;

public class SumTotalPrice extends AbstractSumPrice {

  @Override
  public void visitMenuItem(final IMenuItem menuItem) {
    price += menuItem.getPrice();
  }

}
