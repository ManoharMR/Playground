import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      int i,j;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(i = 0;i<n;i++)
      {
        for(j=n-i;j>0;j--)
          System.out.print(j);
        System.out.print("\n");
      }
        
	}
}