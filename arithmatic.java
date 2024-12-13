package operators;

import java.util.Scanner;

public class arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number:");
		int num2=sc.nextInt();
		
		System.out.println("Addition: "+(num1+num2));
		System.out.println("Substraction: "+(num1-num2));
		System.out.println("Multiplication: "+(num1*num2));
		System.out.println("Division: "+(num1/num2));
		System.out.println("Modules: "+(num1%num2));

	}

}
