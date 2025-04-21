package arrays;

import java.util.Scanner;

public class LinearSearchOneDimension {

	public static void main(String[] args) {
		int a[]= {12,11,10,9,8,9,90,99},search_num, count=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be searched in array");
		search_num =sc.nextInt();
		for (int i=0;i<a.length;i++) {
			if(a[i]==search_num) {
				System.out.println("Number found at index:"+i);
				count++;
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Number not found in array");	
		else
			System.out.println("Number of times "+search_num+" is present in array ="+count);
		
	}

}
