import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int i,j;
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(i= 0; i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          if(j == 0 || j == n-1 || i == 0 || i == n-1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}