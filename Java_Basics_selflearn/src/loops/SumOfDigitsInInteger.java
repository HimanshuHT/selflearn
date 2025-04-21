package loops;

public class SumOfDigitsInInteger {

	public static void main(String[] args) {
		int num =99299999,count=0,temp,even=0,odd=0;
		while (num!=0) {
			temp=num%10;
			count=count+temp;
			if(temp%2==0)
				even+=temp;
			else
				odd+=temp;
			num/=10;
		}
		System.out.println("Count of digits is "+count);
		System.out.println("Count of Even digits is "+even);
		System.out.println("Count of Odd digits is "+odd);
	}

}
