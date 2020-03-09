package com.epam.patterns;

public class singleton_pattern_main {

	public static void main(String[] args) {
		System.out.println("singleton  demo");
		System.out.println("creating a instance s1");
		singleton_pattern s1=singleton_pattern.instance();
		System.out.println("creating a instance s2");
		singleton_pattern s2=singleton_pattern.instance();
		if(s1==s2)
		{
			System.out.println("only one instance exists");
		}
		else {
			System.out.println("different instances exists");
		}
	}

}
