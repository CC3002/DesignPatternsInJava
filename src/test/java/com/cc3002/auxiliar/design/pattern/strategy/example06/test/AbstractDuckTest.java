package com.cc3002.auxiliar.design.pattern.strategy.example06.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.cc3002.auxiliar.design.pattern.strategy.example06.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example06.IDuck;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.fly.FlyBehavior;
import com.cc3002.auxiliar.design.pattern.strategy.example06.behavior.quack.QuackBehavior;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public abstract class AbstractDuckTest {

  protected transient IDuck duck;
  protected final transient OutputStream outputStream = new ByteArrayOutputStream();
  protected final transient PrintStream printStream = new PrintStream(outputStream, true);

  @Before
  public void setUp() {
    duck = newDuck();
    duck.setStream(printStream);
  }

  protected abstract IDuck newDuck();

  @Test
  public void testDuckNotNull() {
    assertNotNull("Expects an object.", duck);
  }

  @Test
  public void testSetStream() {
    assertEquals("Expects the same object.", printStream, duck.getStream());
  }

  @Test
  public void testGetStream() {
    assertEquals("Expects default System.out stream.", System.out, newDuck().getStream());
  }

  @Test
  public void testSwim() {
    duck.swim();
    assertEquals("Expects a swimming message.", Config.ALL_DUCKS_FLOAT + System.lineSeparator(),
        outputStream.toString());
  }

  @Test
  public void testDisplay() {
    duck.display();
    assertEquals("Expects a display message.", displayMessage() + System.lineSeparator(),
        outputStream.toString());
  }

  protected abstract String displayMessage();

  @Test
  public void testQuack() {
    duck.quack();
    assertEquals("Expects a quack output.", quackMessage() + System.lineSeparator(),
        outputStream.toString());
  }

  protected String quackMessage() {
    return Config.QUACK_DUCK;
  }

  @Test
  public void testFly() {
    duck.fly();
    assertEquals("Expects a flying output.", flyingMessage() + System.lineSeparator(),
        outputStream.toString());
  }

  protected String flyingMessage() {
    return Config.FLYING_DUCK;
  }

  @Test
  public void testSetFlyBehavior() {
    final FlyBehavior fly = new FlyBehavior() {

      public void fly(final PrintStream stream) { /* empty */ }
    };
    fly.fly(printStream); // to satisfy coverage report
    duck.setFlyBehavior(fly);
    assertEquals("Expects same fly behavior object.", fly, duck.getFlyBehavior());
  }

  @Test
  public void testSetQuackBehavior() {
    final QuackBehavior quack = new QuackBehavior() {

      public void quack(final PrintStream stream) { /* empty */ }
    };
    quack.quack(printStream); // to satisfy coverage report
    duck.setQuackBehavior(quack);
    assertEquals("Expects same quack behavior object.", quack, duck.getQuackBehavior());
  }
}
