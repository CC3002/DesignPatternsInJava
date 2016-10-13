package com.cc3002.auxiliar.design.pattern.strategy.example01.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.cc3002.auxiliar.design.pattern.strategy.example01.Config;
import com.cc3002.auxiliar.design.pattern.strategy.example01.Duck;
import com.cc3002.auxiliar.design.pattern.strategy.example01.IDuck;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class DuckTest {

  private transient IDuck duck;
  private final transient OutputStream outputStream = new ByteArrayOutputStream();
  private final transient PrintStream printStream = new PrintStream(outputStream, true);

  @Before
  public void setUp() {
    duck = new Duck();
    duck.setStream(printStream);
  }

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
    assertEquals("Expects default System.out stream.", System.out, new Duck().getStream());
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
    assertEquals("Expects a specific output.", Config.DISPLAY_DUCK + System.lineSeparator(),
        outputStream.toString());
  }
}
