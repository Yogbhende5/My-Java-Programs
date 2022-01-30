package Test2;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a number is :"+fact);
		

	}

}
