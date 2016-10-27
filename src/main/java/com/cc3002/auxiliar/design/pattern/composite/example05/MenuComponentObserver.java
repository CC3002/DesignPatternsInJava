package com.cc3002.auxiliar.design.pattern.composite.example05;

import java.util.Observable;
import java.util.Observer;

public class MenuComponentObserver implements Observer, IMenuVisitor {

  @Override
  public void update(final Observable component, final Object parameter) {
    final INotification notification = (INotification) parameter; // we know that it is like this.
    notification.accept(this);
  }

  @Override
  public void visitNewItemNotification(final NewItemNotification notification) {
    // do nothing
  }

  @Override
  public void visitPriceChangeNotification(final PriceChangeNotification newItemNotification) {
    // do nothing
  }

}
