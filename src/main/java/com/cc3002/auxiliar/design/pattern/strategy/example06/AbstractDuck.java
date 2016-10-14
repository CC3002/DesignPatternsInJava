package com.cc3002.auxiliar.design.pattern.strategy.example06;

import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.FlyBehavior;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.QuackBehavior;

import java.io.PrintStream;

public abstract class AbstractDuck implements IDuck {

  private PrintStream stream = System.out;
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public void setFlyBehavior(final FlyBehavior fly) {
    flyBehavior = fly;
  }
  
  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }
  
  public void setQuackBehavior(final QuackBehavior quack) {
    quackBehavior = quack;
  }
  
  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }
  
  public void setStream(final PrintStream stream) {
    this.stream = stream;
  }

  public PrintStream getStream() {
    return stream;
  }

  public void swim() {
    stream.println(Config.ALL_DUCKS_FLOAT);
  }

  public void display() {
    stream.println(displayMessage());
  }

  protected abstract String displayMessage();

  public void quack() {
    quackBehavior.quack(stream);
  }

  public void fly() {
    flyBehavior.fly(stream);
  }

}
