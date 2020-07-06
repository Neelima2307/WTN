package ExceptionHandling;
import java.util.*;
public class Assignment2 {
 public static void main(String[] args)
 {
	 @SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
  System.out.println("Enter the no of elements in array");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the elements");
	 int i;
	 for(i=0;i<n;i++)
		 arr[i]=sc.nextInt();
	 System.out.println("Enter the index no");
	 int index=sc.nextInt();
	 try{
		System.out.println("The array elements in index is"+index+"="+arr[index]);
		System.out.println("The element is loaded successfully");
	 }catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("java.lang.ArrayIndexOutBoundsException");
	 }
	 sc.close();
 }
}
