package com.cc3002.auxiliar.design.pattern.strategy.example03;

import java.io.PrintStream;

public abstract class AbstractDuck implements IDuck {

  private PrintStream stream = System.out;

  public void swim() {
    stream.println(Config.ALL_DUCKS_FLOAT);
  }

  public void setStream(final PrintStream stream) {
    this.stream = stream;
  }

  public PrintStream getStream() {
    return stream;
  }

  public void display() {
    stream.println(displayMessage());
  }

  protected abstract String displayMessage();

  public void quack() {
    stream.println(Config.QUACK_DUCK);
  }

  public void fly() {
    stream.println(Config.FLYING_DUCK);
  }

}
