package com.wipro.flowcontrolstatements;

public class Ex4_fcs {
	public static void main(String args[])
	{
		char a=args[0].charAt(0);
		char b=args[1].charAt(0);
		if(a<b)
		{
			System.out.println(a+","+b);
			
		}
		else
		{
			System.out.println(b+","+a);
		}
	}

}
