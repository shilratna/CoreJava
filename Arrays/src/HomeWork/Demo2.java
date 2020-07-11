package HomeWork;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element Number :");
		int size =scan.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" Elements");
		
		for(int i=0;i<size;i++)
		{
			int a =scan.nextInt();
			
			if(a % 2 == 0)
			{
			       arr[i]=a;
			}
			
		}
    scan.close();
	}

}
