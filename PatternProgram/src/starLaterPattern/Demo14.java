package starLaterPattern;

public class Demo14 {

	public static void main(String[] args) {
		int line = 5;
		int starCount = 1;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=starCount;j++) {
				if(i==j){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			starCount++;
			System.out.println();	
		}	
	}
}


