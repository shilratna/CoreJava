package HomeWork;
/*Write a Java program to create array object using Scanner and 
 * identify even number and odd number elements and print it.*/

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array index:");
		int size=scan.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("**************************************");
		System.out.println("Array Element are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("****************************************");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 !=0)
			{
				System.out.println(arr[i]+" number is odd");
			}
			else 
			{
				System.out.println(arr[i]+"number is even");
			}
	    }
		scan.close();
	}

}
