package com.cc3002.auxiliar.design.pattern.strategy.example02.test;

import com.cc3002.auxiliar.design.pattern.strategy.example02.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example02.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example02.MallardDuck;

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
