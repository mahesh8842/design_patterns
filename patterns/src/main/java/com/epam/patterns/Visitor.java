package com.epam.patterns;

public class Visitor implements IVisitor
{
public void Visit(MyClass myClassElement)
{
	System.out.println("visitor is trying to change value");
	myClassElement.set(100);
	System.out.println("exiting from visitor");
}
}
