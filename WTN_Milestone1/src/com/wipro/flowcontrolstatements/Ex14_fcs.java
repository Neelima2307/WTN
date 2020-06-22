package com.wipro.flowcontrolstatements;

public class Ex14_fcs {
     public static void main(String[] args)
     {
    	 int num=Integer.parseInt(args[0]);
    	 int sum=0,rem=0;
    	 while(num>0)
    	 {
    		 rem=num%10;
    		 sum+=rem;
    		 num=num/10;
    	 }
    	 System.out.println(sum);
     }
}
