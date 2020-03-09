package com.epam.patterns;

public class MyClass implements IOriginalInterface {
private int myInt=5;
public int get()
{
	return myInt;
}
public void set(int value)
{
	myInt=value;
}
public void Accept(IVisitor visitor)
{
	System.out.println("initial value of the integer is"+myInt);
	visitor.Visit(this);
	System.out.println(" value of integer now is"+myInt);
}
}
