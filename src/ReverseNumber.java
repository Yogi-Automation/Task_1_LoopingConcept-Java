import java.util.Scanner;

public class ReverseNumber {
	int numberOne;
	
	void reverseNumWhileLoop() {
		System.out.println("Enter a number : ");
		Scanner getNum = new Scanner(System.in);
		numberOne = getNum.nextInt();
		int reverse = 0;
		
		while(numberOne != 0){
			int numberTwo = numberOne % 10;
			reverse = (reverse*10)+numberTwo;
			numberOne = numberOne / 10;
		}
		
		System.out.println("Reversed number is : " +reverse);
	}
	
	void reverseNumForLoop(){
		System.out.println("Enter a number : ");
		Scanner getNum = new Scanner(System.in);
		numberOne = getNum.nextInt();
		int reverse = 0;
		
		for(int  index=0 ; numberOne!=0 ; index++){
			int numberTwo = numberOne % 10;
			numberOne = numberOne / 10;
			reverse = (reverse*10)+numberTwo;
		}
		
		System.out.println("Reversed number is : " +reverse);
	}
	
}
