package com.wipro.OnedimensionalArray;

public class Ex14_Oda {
	public static void main(String[] args)
	{
		int[][] a=new int[3][3];
		int x=0;
		if(args.length<9)
			System.out.println("Please enter 9 integer number");
		else
		{
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[3*i+j]);
			}
		}
		System.out.println("The given array is:");
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
			}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a[i][j]>x)
						x=a[i][j];
				}
			}
	   System.out.println("The biggest number in the given array is"+x);
	}
		}

}
}