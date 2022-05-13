public class AmstrongNumber {
	void amstrong() {
		int number = 1 ;
		int sum = 0;
	  for(int index =1; index<=500;index++){
	  number = index;
		while(number > 0){
			int numberTwo = number % 10;
			sum = sum + (numberTwo*numberTwo*numberTwo);
			number = number/10;
		}
		if(index == sum) {
		System.out.println(sum);
		}
		sum = 0;
		}
	}
}