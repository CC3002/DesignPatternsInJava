package com.cc3002.auxiliar.design.pattern.command.example05.test;

import com.cc3002.auxiliar.design.pattern.command.example05.AbstractSumPrice;
import com.cc3002.auxiliar.design.pattern.command.example05.SumVegeterianPrice;

public class SumVegeterianPriceTest extends AbstractSumPriceTest {

  @Override
  protected AbstractSumPrice newCommand() {
    return new SumVegeterianPrice();
  }

  @Override
  protected double priceItemTwo() {
    return 0;
  }
  
  @Override
  protected double priceMenu() {
    return 1.3;
  }

}
