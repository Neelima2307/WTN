package com.wipro.flowcontrolstatements;

public class Ex16_fcs {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int r;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			System.out.print(r);
		}
	}

}
