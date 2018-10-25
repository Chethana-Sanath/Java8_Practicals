import java.util.Scanner;


public class PrintStarPattern {

	public PrintStarPattern() {
		// TODO Auto-generated constructor stub
		Scanner userInput = new Scanner(System.in);//get no. of lines to be printed
		System.out.println("Enter no. of lines to be printed: ");
		int number = userInput.nextInt();
		for(int i=1;i<number;i++) {
			for(int j=i;j<number;j++)
				System.out.print(" ");
			for(int k=1;k<i*2;k++)
				System.out.print("*");
		System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintStarPattern();
	}

}
