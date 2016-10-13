package com.cc3002.auxiliar.design.pattern.strategy.example04.test;

import com.cc3002.auxiliar.design.pattern.strategy.example04.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example04.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example04.ReadHeadDuck;

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
