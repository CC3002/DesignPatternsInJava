package com.cc3002.auxiliar.design.pattern.strategy.example06;

import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.FlyWithWings;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.Quack;

public class ReadHeadDuck extends AbstractDuck {

  /**
   * Constructs read head duck that flies and quacks. 
   */
  public ReadHeadDuck() {
    super();
    this.setFlyBehavior(new FlyWithWings());
    this.setQuackBehavior(new Quack());
  }
  
  @Override
  protected String displayMessage() {
    return Config.DISPLAY_READHEAD;
  }

}
