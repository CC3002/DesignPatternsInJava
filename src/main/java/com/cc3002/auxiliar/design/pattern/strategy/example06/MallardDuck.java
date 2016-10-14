package com.cc3002.auxiliar.design.pattern.strategy.example06;

import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.FlyWithWings;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.Quack;

public class MallardDuck extends AbstractDuck {

  /** 
   * Creates Mallard duck that can fly and quack. 
   * 
   */
  public MallardDuck() {
    super();
    this.setFlyBehavior(new FlyWithWings());
    this.setQuackBehavior(new Quack());
  }

  @Override
  protected String displayMessage() {
    return Config.DISPLAY_MALLARD;
  }

}
