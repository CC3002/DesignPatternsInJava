package com.cc3002.auxiliar.design.pattern.strategy.example06.test;

import com.cc3002.auxiliar.design.pattern.strategy.example06.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example06.DecoyDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example06.IDuck;

public class DecoyDuckTest extends AbstractDuckTest {

  @Override
  protected IDuck newDuck() {
    return new DecoyDuck();
  }

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_DECOY;
  }

  protected String quackMessage() {
    return Config.SILENT;
  }

  protected String flyingMessage() {
    return Config.NO_FLYING_DUCK;
  }
}
