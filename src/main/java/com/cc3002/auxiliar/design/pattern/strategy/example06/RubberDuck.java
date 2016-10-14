package com.cc3002.auxiliar.design.pattern.strategy.example06;

import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.NoFly;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.Squeak;

public class RubberDuck extends AbstractDuck {

  /**
   * Constructs rubber duck that cannot fly but squeaks.
   */
  public RubberDuck() {
    super();
    this.setFlyBehavior(new NoFly());
    this.setQuackBehavior(new Squeak());
  }
  
  @Override
  protected String displayMessage() {
    return Config.DISPLAY_RUBBER;
  }

}
