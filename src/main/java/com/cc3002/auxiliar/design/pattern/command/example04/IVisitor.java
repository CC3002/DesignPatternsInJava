package com.cc3002.auxiliar.design.pattern.command.example04;

public interface IVisitor {

  void visitMenu(IMenu menu);

  void visitMenuItem(IMenuItem menuItem);

}
