package com.wipro.flowcontrolstatements;

public class Ex12_fcs {
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int k=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				k++;
		}
		if(k==2)
			System.out.println(num+"is a prime num");
		else
			System.out.println(num+"is not a prime num");
	}

}
