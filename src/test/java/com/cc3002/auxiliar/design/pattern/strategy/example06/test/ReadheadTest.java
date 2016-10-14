package com.cc3002.auxiliar.design.pattern.strategy.example06.test;

import com.cc3002.auxiliar.design.pattern.strategy.example06.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example06.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example06.ReadHeadDuck;

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
