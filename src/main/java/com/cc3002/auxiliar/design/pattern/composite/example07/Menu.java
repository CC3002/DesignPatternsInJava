package com.cc3002.auxiliar.design.pattern.composite.example07;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

  private final List<IMenuComponent> items = new ArrayList<IMenuComponent>();
  private final Group observers = new Group();

  @Override
  public void addItem(final IMenuComponent menuItem) {
    menuItem.addObserver(MenuEvent.MENU_EVENT, this::onPriceChange);
    items.add(menuItem);
    this.notifyNewItem();
  }

  public void onPriceChange(final MenuEvent event) {
    observers.fireEvent(event);
  }

  private void notifyNewItem() {
    observers.fireEvent(new MenuEvent(MenuEvent.NEW_ITEM));
  }

  @Override
  public long size() {
    return items.size();
  }

  @Override
  public void addObserver(final EventType<MenuEvent> eventType,
      final EventHandler<? super MenuEvent> eventHandler) {
    observers.addEventHandler(eventType, eventHandler);
  }

}
