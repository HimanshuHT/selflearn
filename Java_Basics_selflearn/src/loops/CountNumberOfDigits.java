package loops;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int number=111,count=0;
		while(number!=0) {
			number/=10;
			count+=1;
		}
		System.out.println("Number of Digits = "+count);

	}

}
