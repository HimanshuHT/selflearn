package arrays;

public class Even_Odd_Numbers_OneDimension {

	public static void main(String[] args) {
		int a[]= {123,122,232,324,123,32,12,123,123,232,2},even=0,odd=0,Sum=0,SumEven=0,SumOdd=0;
		
		for(int x:a) {
			Sum=Sum+x;
			if(x%2==0) {
				even++;
				SumEven=SumEven+x;
			}
			else {
				odd++;
				SumOdd=SumOdd+x;
			}
		}
		System.out.println("Sum of digits in array:"+Sum);
		System.out.println("Number of even digits in array:"+even);
		System.out.println("Sum of even digits in array:"+SumEven);
		System.out.println("Number of odd digits in array:"+odd);
		System.out.println("Sum of odd digits in array:"+SumOdd);
	}

}
