package com.cc3002.auxiliar.design.pattern.observer.example02.test;

import static org.junit.Assert.assertEquals;

import com.cc3002.auxiliar.design.pattern.observer.example02.IWeatherDataGetter;
import com.cc3002.auxiliar.design.pattern.observer.example02.IWeatherDataSetter;
import com.cc3002.auxiliar.design.pattern.observer.example02.WeatherData;

import org.junit.Before;
import org.junit.Test;

public class WeatherDataTest {

  private transient IWeatherDataSetter setter;
  private transient IWeatherDataGetter getter;

  /**
   * Test set up.
   */
  @Before
  public void setUp() {
    final WeatherData data = new WeatherData();
    setter = data;
    getter = data;
  }

  @Test
  public void testSetHumidity() {
    setter.setHumidity(1.1);
    assertEquals("Expects same humidity value.", 1.1, getter.getHumidity(), 0.0);
  }

  @Test
  public void testSetPressure() {
    setter.setPressure(1024);
    assertEquals("Expects same pressure value.", 1024, getter.getPressure(), 0.0);
  }

  @Test
  public void testSetTemperature() {
    setter.setTemperature(37);
    assertEquals("Expects same temperature value.", 37, getter.getTemperature(), 0.0);
  }
}
