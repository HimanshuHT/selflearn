package loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number =sc.nextInt();
		System.out.println("Original Number is : "+number);
		while (number != 0) {
			int temp = number%10 ;
			reverse = reverse*10 + temp;
			number /=10;
		}
		System.out.println("Reversed Number is : "+reverse);
	}

}