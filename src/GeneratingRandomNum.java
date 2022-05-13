import java.util.Random;
import java.util.Scanner;
public class GeneratingRandomNum {
	public void generatingNumber1(int numberOne) {	{
		Random RandNum = new Random();
		int randnumOne = RandNum.nextInt(30)+1;
		
		System.out.println("Try to guess this number : "+randnumOne);
		
		numberOne=0;
		
		while(numberOne != randnumOne) {
			
			System.out.println("Enter a number to guess : ");
			
			
		if(numberOne>=1 && numberOne<=30) {
			if(numberOne < randnumOne) {
				System.out.println("Too Low.....try again");
			}
			
			else if(numberOne > randnumOne) {
				System.out.println("Too High.....Try again");
			}
			
			}
		else{
				System.out.println("Enter a valid number between 1 to 30");
			}
		}
		
		System.out.println("Congrats");
	}

	public void generatingNumber(int numberOne) {
		// TODO Auto-generated method stub
		
	}		
}