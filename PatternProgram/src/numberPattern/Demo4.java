package numberPattern;

public class Demo4 {

	public static void main(String[] args) {

      int line = 5;
      int num = 5;
      
      for(int i=1;i<=line;i++)
      {
    	  for(int j=1;j<=line;j++)
    	  {
    		  System.out.print(num);
    		  num--;
    	  }
    	  num = 5;
    	  System.out.println();
      }

	}

}
