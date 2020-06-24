package com.wipro.OnedimensionalArray;

public class Ex7_Oda {
	public static void main(String[] args)
	{
		int []a=new int[] {12,34,12,45,67,89};
		int dup=a.length-1;
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					dup--;
					for(int k=j;k<a.length-1;k++)
					{
						a[k]=a[k+1];
					}
				}
			}
				
		}
		for(int i=0;i<dup;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
