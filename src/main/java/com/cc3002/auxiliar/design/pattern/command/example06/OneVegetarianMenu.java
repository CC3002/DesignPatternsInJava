package com.cc3002.auxiliar.design.pattern.command.example06;

public class OneVegetarianMenu implements IVisitor, ICommand {

  private IMenuComponent vegetarianMenu;
  private boolean anyNonVegetarian;

  @Override
  public void execute(final IMenuComponent menu) {
    menu.accept(this);
  }

  @Override
  public void visitMenu(final IMenu menu) {
    final boolean previousValue = anyNonVegetarian;
    anyNonVegetarian = false;
    menu.forEach(each -> each.accept(this));
    if (!anyNonVegetarian) {
      vegetarianMenu = menu;
    }
    anyNonVegetarian = previousValue || anyNonVegetarian;
  }

  @Override
  public void visitMenuItem(final IMenuItem menuItem) {
    if (menuItem.isVegetarian()) {
      if (vegetarianMenu == null) {
        vegetarianMenu = menuItem;
      }
    } else {
      anyNonVegetarian = true;
    }
  }

  public IMenuComponent getMenu() {
    return vegetarianMenu;
  }

}
