package loops;

public class EvenAndOddDigitsInInteger {

	public static void main(String[] args) {
		int num=123123567, even=0,odd=0,count=0,temp;
		while(num!=0) {
			temp=num%10;
			if(temp%2==0)
				even++;
			else
				odd++;
			num/=10;
			count++;
		}
		System.out.println("Total Number of Didits: "+count);
		System.out.println("Number of Even Digits : "+even);
		System.out.println("Number of Odd Digits : "+odd);
	}
}
