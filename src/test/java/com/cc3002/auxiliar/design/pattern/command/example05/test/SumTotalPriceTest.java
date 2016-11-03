package com.cc3002.auxiliar.design.pattern.command.example05.test;

import com.cc3002.auxiliar.design.pattern.command.example05.AbstractSumPrice;
import com.cc3002.auxiliar.design.pattern.command.example05.SumTotalPrice;

public class SumTotalPriceTest extends AbstractSumPriceTest {

  @Override
  protected AbstractSumPrice newCommand() {
    return new SumTotalPrice();
  }
}
