package operators;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Num1 is greater");
		}
		else {
			System.out.println("Num2 is greater");
		}
	}

}
