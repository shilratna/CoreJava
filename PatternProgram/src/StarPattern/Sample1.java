package StarPattern;
/*
 * * * * *
   * * *
     *    
   * * *
 * * * * *
 
 */

public class Sample1 {

	public static void main(String[] args) {

           int lineCount = 5;
           int starCount = 5;
           int spaceCount =0;
           int mid =3;
           
           for(int i=1;i<=lineCount;i++)
           {
        	   for(int k=1;k<=spaceCount;k++)
        	   {
        		   System.out.print(" ");
        	   }
        	   for(int j=1;j<=starCount;j++)
        	   {
        		   System.out.print("*");
        	   }
        	  
        	   System.out.println();
        	   if(i<mid)
        	   {
        		   starCount=starCount-2;
        		   spaceCount++;
        	   }
        	   else
        	   {
        		   starCount=starCount+2;
        		   spaceCount--;
        	   }
           }

	}

}
