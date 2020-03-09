package com.epam.patterns;

public class visitorpatterns {
	public static void main(String[] args)
	{
		System.out.println(" visitor pattern");
		IVisitor visitor=new Visitor();
		MyClass myClass=new MyClass();
		myClass.Accept(visitor);
	}
}
