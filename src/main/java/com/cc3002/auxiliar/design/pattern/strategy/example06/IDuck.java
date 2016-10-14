package com.cc3002.auxiliar.design.pattern.strategy.example06;

import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.FlyBehavior;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.QuackBehavior;

import java.io.PrintStream;

public interface IDuck {

  void swim();

  void setStream(PrintStream stream);

  PrintStream getStream();

  void display();

  void quack();

  void fly();

  void setFlyBehavior(FlyBehavior fly);

  FlyBehavior getFlyBehavior();

  void setQuackBehavior(QuackBehavior quack);

  QuackBehavior getQuackBehavior();

}
