package com.cc3002.auxiliar.design.pattern.strategy.example06;

import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.NoFly;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.Silent;

public class DecoyDuck extends AbstractDuck {

  /**
   * Constructs decoy duck that cannot fly and is silent.
   */
  public DecoyDuck() {
    super();
    this.setFlyBehavior(new NoFly());
    this.setQuackBehavior(new Silent());
  }
  
  @Override
  protected String displayMessage() {
    return Config.DISPLAY_DECOY;
  }

}
