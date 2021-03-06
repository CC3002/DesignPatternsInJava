package com.cc3002.auxiliar.design.pattern.strategy.example01;

import java.io.PrintStream;

public class Duck implements IDuck {

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
    stream.println(Config.DISPLAY_DUCK);
  }

  public void quack() {
    stream.println(Config.QUACK_DUCK);
  }

}
