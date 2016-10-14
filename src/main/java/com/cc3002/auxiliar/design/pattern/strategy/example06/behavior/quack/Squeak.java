package com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack;

import com.cc3002.auxiliar.design.pattern.strategy.example06.Config;

import java.io.PrintStream;

public class Squeak implements QuackBehavior {

  public void quack(final PrintStream stream) {
    stream.println(Config.SQUEAK);
  }
}
