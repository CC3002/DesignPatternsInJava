package com.cc3002.auxiliar.design.pattern.strategy.example02.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.cc3002.auxiliar.design.pattern.strategy.example02.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example02.IDuck;

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
    assertEquals("Expects a specific output.", Config.ALL_DUCKS_FLOAT + System.lineSeparator(),
        outputStream.toString());
  }

  @Test
  public void testDisplay() {
    duck.display();
    assertEquals("Expects a specific output.", displayMessage() + System.lineSeparator(),
        outputStream.toString());
  }

  protected abstract String displayMessage();

  @Test
  public void testQuack() {
    duck.quack();
    assertEquals("Expects a specific output.", Config.QUACK_DUCK + System.lineSeparator(),
        outputStream.toString());
  }
}
