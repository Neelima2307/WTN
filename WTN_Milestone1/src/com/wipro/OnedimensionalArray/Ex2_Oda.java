package com.wipro.OnedimensionalArray;

public class Ex2_Oda {
	public static void main(String args[])
	{
		int a[]=new int[] {25,26,4,54,99};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[1];
			}
		}
		System.out.println(min+","+max);
		}

}
