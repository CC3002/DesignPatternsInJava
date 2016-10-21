package com.cc3002.auxiliar.design.pattern.observer.example03.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.observer.example03.CurrentConditionsDisplay;
import com.cc3002.auxiliar.design.pattern.observer.example03.WeatherData;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class CurrentConditionsDisplayTest {

  private CurrentConditionsDisplay display;
  private final OutputStream outputStream = new ByteArrayOutputStream();
  private final PrintStream printStream = new PrintStream(outputStream, true);

  @Before
  public void setUp() {
    display = new CurrentConditionsDisplay();
    display.setStream(printStream);
  }

  @Test
  public void testSetStream() {
    assertEquals("Expects the same object.", printStream, display.getStream());
  }

  @Test
  public void testUpdate() {
    display.update(37, 1023, 80);
    assertEquals("Unexpected contidion output",
        "Current conditions: 37 C degrees, 1023 hPa, 80% humidity." + System.lineSeparator(),
        outputStream.toString());
  }

  @Test
  public void testDisplayInitial() {
    display.display();
    assertEquals("Unexpected default values.",
        "Current conditions: 0 C degrees, 0 hPa, 0% humidity." + System.lineSeparator(),
        outputStream.toString());
  }

  @Test
  public void testDisplayUpdated() {
    display.update(23.3, 1012.3, 60.1);
    display.display();
    final String expected =
        "Current conditions: 23 C degrees, 1012 hPa, 60% humidity." + System.lineSeparator()
            + "Current conditions: 23 C degrees, 1012 hPa, 60% humidity." + System.lineSeparator();
    assertEquals("Unexpected contidion output", expected, outputStream.toString());
  }
  
  @Test
  public void testWeatherDataInformsAboutChange() {
    final WeatherData data = new WeatherData();
    data.addDisplay(display);
    data.setTemperature(15);
    data.setHumidity(94.3);
    data.setPressure(1017.6);
    data.measurementsChanged();
    assertEquals("Unexpected default values.",
        "Current conditions: 15 C degrees, 1018 hPa, 94% humidity." + System.lineSeparator(),
        outputStream.toString());
  }
}
