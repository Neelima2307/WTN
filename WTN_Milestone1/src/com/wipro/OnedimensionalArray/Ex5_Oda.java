package com.wipro.OnedimensionalArray;

import java.util.Arrays;

public class Ex5_Oda {
	public static void main(String args[])
	{
		int[] a= {5,2,7,3,1,6};
		Arrays.sort(a);
		System.out.println("The first min value "+a[0]);
		System.out.println("The first max value "+a[a.length-1]);
		System.out.println("The second min value "+a[1]);
		System.out.println("The second max value "+a[a.length-2]);
	}

}
