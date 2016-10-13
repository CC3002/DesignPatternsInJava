package com.cc3002.auxiliar.design.pattern.strategy.example04;

public class RubberDuck extends AbstractDuck {

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_RUBBER;
  }

  @Override
  protected String quackMessage() {
    return Config.SQUEAK;
  }

  @Override
  protected String flyingMessage() {
    return Config.NO_FLYING_DUCK;
  }

}
