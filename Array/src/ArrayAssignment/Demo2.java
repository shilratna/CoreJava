package ArrayAssignment;
/*Write a Java program on demonstrating two dimensional array.*/

public class Demo2 {

	public static void main(String[] args) {
		
		//Instantiation
		int arr1[][] = new int[3][3];
		
		//Initialization
		arr1[0][0] = 10;
		arr1[0][2] = 4;
		
		arr1[1][0] = 5;
		arr1[1][1] = 98;
		arr1[2][2] = 38;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		 
	}

}
