package HomeWork;
/*. Write a Java program to generate random number and 
 *  identify whether the number is even or odd.*/

import java.util.Random;

public class RandomNumberEvenOdd {
	
	void EvenOdd()
	{
		Random r1 = new Random();
		int res1 = r1.nextInt(10000);
		
		if(res1 % 2 !=0)
		{
			System.out.println(res1+" Number is odd");
		}
		else
		{
			System.out.println(res1+" Number is even");
		}
		
	}

	public static void main(String[] args) {

		RandomNumberEvenOdd n1 = new RandomNumberEvenOdd();
		n1.EvenOdd();

	}

}
