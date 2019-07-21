import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int m = in.nextInt();
      int n=0;
      for(int i = 0;i<m;i++)
      {
        for(int j = 0;j<=i;j++)
        {
          if(n%2==1)
            System.out.print("#");
          else
            System.out.print("*");
          n++;
        }
        System.out.print("\n");
      }
    }
}