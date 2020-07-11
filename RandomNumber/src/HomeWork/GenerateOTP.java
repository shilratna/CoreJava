package HomeWork;

import java.util.Random;

public class GenerateOTP {
	
	void OTPGeneration()
	{
	  Random r1 = new Random();
	  int res1 = r1.nextInt(10000);
	  
	  int digits=String.valueOf(res1).length();
	  
	  if(digits ==4 )
	  {
		  System.out.println("4 digit number is :"+res1);
	  }
	  else
	  {
		  OTPGeneration();
	  }
	  
	}

	public static void main(String[] args) {
		
		GenerateOTP g1= new GenerateOTP();
		g1.OTPGeneration();

	}

}
