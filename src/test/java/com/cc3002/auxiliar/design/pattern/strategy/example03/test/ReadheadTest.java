package com.cc3002.auxiliar.design.pattern.strategy.example03.test;

import com.cc3002.auxiliar.design.pattern.strategy.example03.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example03.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example03.ReadHeadDuck;

public class ReadheadTest extends AbstractDuckTest {

  @Override
  protected IDuck newDuck() {
    return new ReadHeadDuck();
  }

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_READHEAD;
  }
}
