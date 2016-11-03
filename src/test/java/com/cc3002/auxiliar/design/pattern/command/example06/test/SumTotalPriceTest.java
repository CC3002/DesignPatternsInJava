package com.cc3002.auxiliar.design.pattern.command.example06.test;

import com.cc3002.auxiliar.design.pattern.command.example06.AbstractSumPrice;
import com.cc3002.auxiliar.design.pattern.command.example06.SumTotalPrice;

public class SumTotalPriceTest extends AbstractSumPriceTest {

  @Override
  protected AbstractSumPrice newCommand() {
    return new SumTotalPrice();
  }
}
