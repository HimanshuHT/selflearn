package arrays;

public class SumofArrayElements_OneDimension {

	public static void main(String[] args) {
		
		int a[] = {21,232,324,41212,12,4324,232}, sum =0;
		for (int x:a)
			sum=sum+x;
		System.out.println("Sum of digits in this array is :"+sum);
	}

}
