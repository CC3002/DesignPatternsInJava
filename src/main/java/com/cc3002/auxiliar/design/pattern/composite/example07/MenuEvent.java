package com.cc3002.auxiliar.design.pattern.composite.example07;

import javafx.event.Event;
import javafx.event.EventType;

public class MenuEvent extends Event {

  private static final long serialVersionUID = 5409005021406859724L;

  public static final EventType<MenuEvent> MENU_EVENT =
      new EventType<>(EventType.ROOT, "MENU_EVENT");

  public static final EventType<MenuEvent> PRICE_CHANGE =
      new EventType<>(MENU_EVENT, "Price change");

  public static final EventType<MenuEvent> NEW_ITEM = new EventType<>(MENU_EVENT, "New item");

  public MenuEvent(final EventType<? extends Event> eventType) {
    super(eventType);
  }
  
}
