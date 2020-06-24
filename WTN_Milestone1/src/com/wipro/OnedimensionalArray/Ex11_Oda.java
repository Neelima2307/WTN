package com.wipro.OnedimensionalArray;

public class Ex11_Oda {
   public static void main(String[] args)
   {
	   int a[]=new int[] {1,4,2,4};
	   int i;
	  boolean b=false;
	   for(i=0;i<a.length;i++)
	   {
		   if(a[i]==1||a[i]==4)
		   {
			   b=true;
		   }
		   else
		   {
			   b=false;
			   break;
		   }
	   }
	   if(b)
		   System.out.println("True");
	   else
		   System.out.println("False");
   }
}
