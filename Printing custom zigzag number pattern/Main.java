import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      int i,j,m=0;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        m++;
        if(i % 2 == 1)
        {
          for(j=0;j<n-1;j++)
            System.out.print(m);
          System.out.print(m+1);
        }
        else
         {
          System.out.print(m+1);
          for(j=0;j<n-1;j++)
            System.out.print(m);
         
        } 
         System.out.print("\n");
      }
	}
}