package HomeWork;
/*Write a Java program to generate 2 random numbers 
 * and identify which number is larger.
 * */

import java.util.Random;

public class RandomNumberLarger {
	
	void largerNumber()
	{
		Random r1 = new Random();
		int res1 = r1.nextInt(10000);
		int res2 = r1.nextInt(10000);
		
		if (res1>= res2)
		{
			System.out.println(res1+" Number is larger");
		}
		else
		{
			System.out.println(res2+" Number is larger");
		}
	}

	public static void main(String[] args) {
		
		RandomNumberLarger l1= new RandomNumberLarger();
		l1.largerNumber();
		
		

	}

}
