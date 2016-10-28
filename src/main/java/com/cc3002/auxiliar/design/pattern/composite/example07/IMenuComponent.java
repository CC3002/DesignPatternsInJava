package com.cc3002.auxiliar.design.pattern.composite.example07;

import javafx.event.EventHandler;
import javafx.event.EventType;

public interface IMenuComponent {

  void addObserver(EventType<MenuEvent> eventType, EventHandler<? super MenuEvent> eventHandler);
}
