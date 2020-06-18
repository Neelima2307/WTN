package com.wipro.flowcontrolstatements;

public class Ex1_fcs {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		if(num>0)
		{
			System.out.println(num+" is a positive num");
			
		}
		else if(num<0)
		{
			System.out.println(num+" is a negative num");
		}
		else
		{
			System.out.println(num+" is a zero num");
		}
	}

}
