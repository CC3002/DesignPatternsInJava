package com.cc3002.auxiliar.design.pattern.strategy.example04.test;

import com.cc3002.auxiliar.design.pattern.strategy.example04.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example04.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example04.MallardDuck;

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
