import java.util.Scanner;
class Main
{ 
	// Recursive function to return gcd of a and b 
	static int gcd(int a, int b) 
	{ 
		// Everything divides 0 
		if (a == 0) 
		return b; 
		if (b == 0) 
		return a; 
	
		// base case 
		if (a == b) 
			return a; 
	
		// a is greater 
		if (a > b) 
			return gcd(a-b, b); 
		return gcd(a, b-a); 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = gcd (a,b);
      int e = gcd (d,c);
      System.out.println(e); 
	} 
} 
