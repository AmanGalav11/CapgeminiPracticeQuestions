import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Fill the code here
		System.out.println("Enter a number");
		String num = sc.nextLine();
		int n= Integer.parseInt(num);
		
		if(n<0) {
			System.out.println(num+" is an invalid number. Please enter a positive number");
			return;
		}
		
		int sq = n*n;
		StringBuilder str = new StringBuilder();
		str.append(sq);
		
		int numlen= num.length();

		int f = str.length()-numlen;
		int l = str.length();
		
		if(str.substring(f,l).equals(num)) {
			System.out.println(n+" is an automorphic number");
			
		}
		else {
			System.out.println(n+" is not an automorphic number");
		}

		
		int sum=0;

		int n1=n;
		while(n1>0) {
			int d = n1%10;
			sum+=d;
			n1=n1/10;
		}
		if(n%sum==0) {
			System.out.println(n+" is an harshad number");
		}
		else {
			System.out.println(n+" is not an harshad number");
		}
}
}
