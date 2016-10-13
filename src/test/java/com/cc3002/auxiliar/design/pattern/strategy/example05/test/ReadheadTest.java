package com.cc3002.auxiliar.design.pattern.strategy.example05.test;

import com.cc3002.auxiliar.design.pattern.strategy.example05.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example05.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example05.ReadHeadDuck;

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
