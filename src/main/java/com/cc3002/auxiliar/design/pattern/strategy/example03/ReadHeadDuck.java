package com.cc3002.auxiliar.design.pattern.strategy.example03;

public class ReadHeadDuck extends AbstractDuck {

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_READHEAD;
  }

}
