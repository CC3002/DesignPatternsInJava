package com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly;

import com.cc3002.auxiliar.design.pattern.strategy.example06.Config;

import java.io.PrintStream;

public class NoFly implements FlyBehavior {

  public void fly(final PrintStream stream) {
    stream.println(Config.NO_FLYING_DUCK);
  }

}
