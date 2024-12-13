package operators;

import java.util.Scanner;

public class positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter  number : ");
		int num1=sc.nextInt();
		
		if(num1>=0) {
			System.out.println("num1 is positive: "+num1);
		}
		else{
			System.out.println("Num1 is negative: "+num1);
		}



	}

}
