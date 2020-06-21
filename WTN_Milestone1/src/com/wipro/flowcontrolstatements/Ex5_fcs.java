package com.wipro.flowcontrolstatements;

public class Ex5_fcs {
	public static void main(String[] args)
	{
		char a;
		a=args[0].charAt(0);
		int b=a;
		if(b>=65&&b<=122)
		
			System.out.println("Alphabet");
		
		else if(b>=48&&b<=57)
		
			System.out.println("Digit");
		
		else
		
			System.out.println("Special Character");
		
	}

}
