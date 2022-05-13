import java.util.Scanner;

public class CodeRunner {

	public static void main(String[] args) {
		
		GeneratingRandomNum onum = new GeneratingRandomNum();
		System.out.println("Enter a number to guess : ");
		Scanner gussnum = new Scanner(System.in);
		int numberOne = gussnum.nextInt();
		onum.generatingNumber(numberOne);
		
		//ReverseNumber orev = new ReverseNumber();
		//orev.reverseNumForLoop();
		//orev.reverseNumWhileLoop();
		
		
		//AmstrongNumber oAmst = new AmstrongNumber();
		//oAmst.amstrong();
	}

}
