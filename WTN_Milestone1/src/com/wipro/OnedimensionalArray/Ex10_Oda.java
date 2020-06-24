package com.wipro.OnedimensionalArray;

public class Ex10_Oda {
   public static void main(String[] args)
   {
	   int a[]=new int[] {0,1,1,0,0,1,1};
	   int i;
	   for(i=0;i<a.length;i++)
	   {
		   if(a[i]%2==0)
		   {
			   System.out.print(a[i]+" ");
		   }
	   }
	   for(i=0;i<a.length;i++)
	   {
		   if(a[i]%2!=0)
		   {
			   System.out.print(a[i]+" ");
		   }
	   }
   }
}
