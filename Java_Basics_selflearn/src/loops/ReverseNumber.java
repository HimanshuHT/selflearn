package loops;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1234, reverse = 0;
		System.out.println("Original Number is : "+number);
		while (number != 0) {
			int temp = number%10 ;
			reverse = reverse*10 + temp;
			number /=10;
		}
		System.out.println("Reversed Number is : "+reverse);
	}

}
