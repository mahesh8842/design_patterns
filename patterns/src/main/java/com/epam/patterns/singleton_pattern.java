package com.epam.patterns;

public class singleton_pattern {
	private static singleton_pattern instance=new singleton_pattern();
	private int numberOfInstances=0;
	private singleton_pattern()
	{
		System.out.println("instanciating inside private constructor");
		numberOfInstances++;
		System.out.println("number of instances"+numberOfInstances);
	}
	public static singleton_pattern instance()
	{
		System.out.println("we already have an instance now,use it..");
		return instance;
	}
}
