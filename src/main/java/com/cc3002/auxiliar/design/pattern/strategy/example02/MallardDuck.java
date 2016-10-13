package com.cc3002.auxiliar.design.pattern.strategy.example02;

public class MallardDuck extends AbstractDuck {

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_MALLARD;
  }

}
