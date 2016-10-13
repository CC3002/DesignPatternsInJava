package com.cc3002.auxiliar.design.pattern.strategy.example04;

public class ReadHeadDuck extends AbstractDuck {

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_READHEAD;
  }

}
