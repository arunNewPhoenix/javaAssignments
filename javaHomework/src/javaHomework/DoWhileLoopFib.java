package javaHomework;

public class DoWhileLoopFib {
	
  public static void main(String[] args) {
	
	  int n = 5;
	  
	int [] fib = new int[n];
	  fib[0] = 0;
	  fib[1] = 1;
	  
	  for(int i=2;i<n;i++) {
		  fib[i] = fib[i-1]+fib[i-2];
	  }
	  
	 System.out.println(fib[n-1]); 
	 //here printing the 5th fibonacci series
	// 0 1 1 2 3 5 
	  
}	

}
