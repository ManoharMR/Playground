import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1; i<=n;i++)
      {
        for(int j=0;j<n-i;j++)
          System.out.print(" ");
        for(int k=0;k<(2*i-1);k++)
          System.out.print("*");
        System.out.print("\n");
      }
	}
}