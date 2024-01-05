package javaHomework;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int n  = 505;
		int n_see = n;
		int reverse =0;
		while(n!=0) {
		int digit = n%10;
        reverse = reverse*10+digit;
        n = n/10;
		}
		
		if(n_see==reverse)
		System.out.println("is a palindrome");
		
		else {
			System.out.println("not a palindrome");
		}
	}

}
