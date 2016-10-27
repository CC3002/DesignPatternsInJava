package com.cc3002.auxiliar.design.pattern.composite.example05;

public class NewItemNotification implements INotification {

  private final IMenuComponent item;

  public NewItemNotification(final IMenuComponent menuItem) {
    this.item = menuItem;
  }

  @Override
  public void accept(final IMenuVisitor visitor) {
    visitor.visitNewItemNotification(this);
  }

  public IMenuComponent getItem() {
    return item;
  }

}
