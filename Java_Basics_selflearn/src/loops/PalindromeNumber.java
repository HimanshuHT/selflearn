package loops;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number =1441, reverse=0, temp;
		int var = number;
		System.out.println("Original Number is : "+number);
		while(var!=0) {
			temp = var%10;
			reverse = reverse*10 + temp;
			var/=10;
		}
		System.out.println("Reversed Number is : "+reverse);
		if(number==reverse)
			System.out.println("Number is a Palindrome Number");
		else
			System.out.println("Number is not Palindrome Number");

	}

}
