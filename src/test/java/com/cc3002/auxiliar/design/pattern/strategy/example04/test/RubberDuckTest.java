package com.cc3002.auxiliar.design.pattern.strategy.example04.test;

import com.cc3002.auxiliar.design.pattern.strategy.example04.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example04.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example04.RubberDuck;

public class RubberDuckTest extends AbstractDuckTest {

  @Override
  protected IDuck newDuck() {
    return new RubberDuck();
  }

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_RUBBER;
  }

  protected String quackMessage() {
    return Config.SQUEAK;
  }

  protected String flyingMessage() {
    return Config.NO_FLYING_DUCK;
  }
}
