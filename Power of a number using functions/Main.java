import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      int ans = pww(b,e);
      System.out.println(ans);    
    }
  public static int pww (int a, int b)
  {
    int p=1;
    for(int i=1;i<=b;i++)
      p*=a;
    return p;
  }
}