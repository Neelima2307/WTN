package com.wipro.flowcontrolstatements;

public class Ex3_fcs {
	public static void main(String[] args)
	{
		int k=args.length;
		if(k==0)
		{
			System.out.println("No Values");
		}
		else
		{
			for(int i=0;i<k-1;i++) {
				System.out.print(args[i]+',');
			}
			System.out.print(args[args.length-1]);
		}
	}

}
