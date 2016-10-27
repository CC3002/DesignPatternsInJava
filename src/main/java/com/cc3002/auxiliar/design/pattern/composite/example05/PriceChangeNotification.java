package com.cc3002.auxiliar.design.pattern.composite.example05;

public class PriceChangeNotification implements INotification {

  private final IMenuItem item;
  private final double oldPrice;
  private final double newPrice;

  /**
   * Creates new notification object.
   * 
   * @param item changed item
   * @param oldPrice old price
   * @param newPrice new price
   */
  public PriceChangeNotification(final IMenuItem item, final double oldPrice,
      final double newPrice) {
    this.item = item;
    this.oldPrice = oldPrice;
    this.newPrice = newPrice;
  }

  public IMenuItem getItem() {
    return item;
  }

  public double getOldPrice() {
    return oldPrice;
  }

  public double getNewPrice() {
    return newPrice;
  }

  @Override
  public void accept(final IMenuVisitor visitor) {
    visitor.visitPriceChangeNotification(this);
  }

}
