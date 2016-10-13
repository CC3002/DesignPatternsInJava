package com.cc3002.auxiliar.design.pattern.strategy.example05;

public class DecoyDuck extends AbstractDuck {

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_DECOY;
  }

  @Override
  protected String quackMessage() {
    return Config.SILENT;
  }

  @Override
  protected String flyingMessage() {
    return Config.NO_FLYING_DUCK;
  }

}
