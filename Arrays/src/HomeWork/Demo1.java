package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
	      
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index size");
		int size =scan.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" Element");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array Element are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("Array element After Sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
   scan.close();
	}

}
