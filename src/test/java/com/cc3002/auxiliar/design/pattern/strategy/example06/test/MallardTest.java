package com.cc3002.auxiliar.design.pattern.strategy.example06.test;

import com.cc3002.auxiliar.design.pattern.strategy.example06.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example06.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example06.MallardDuck;

public class MallardTest extends AbstractDuckTest {

  @Override
  protected IDuck newDuck() {
    return new MallardDuck();
  }

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_MALLARD;
  }


}
