package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {
   public static void main(String[] args)
   {
	   @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the no of element in array");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   System.out.println("Enter the element in an array");
	   try
	   {
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.println("Enter the index no");
		   int index=sc.nextInt();
		   System.out.println("The value at the index is"+index+"= "+arr[index]);
		   System.out.println("The array element is sucessfully accessed");
		   
	   } catch(InputMismatchException e)
	   {
		   System.out.println("java.util.InputMismatchException");
	   }
   }
}
