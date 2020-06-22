package com.wipro.flowcontrolstatements;

public class Ex13_fcs {
       public static void main(String[] args)
       {
    	   int i,j,k=0;
    	   for(i=10;i<=99;i++)
    	   {
    		   k=0;
    		   for(j=1;j<=i;j++)
    		   {
    			   if(i%j==0)
    				   k++;
    		   }
    		   if(k==2)
    			   System.out.print(i+" ");
    	   }
       }
}
