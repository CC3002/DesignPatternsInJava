package com.cc3002.auxiliar.design.pattern.composite.example05;

public interface IMenuVisitor {

  void visitNewItemNotification(NewItemNotification notification);

  void visitPriceChangeNotification(PriceChangeNotification newItemNotification);

}
