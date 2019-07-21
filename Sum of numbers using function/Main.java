import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(sunum(n));
	}
  public static int sunum (int a)
{
  int i=0,s=0;
  for(i=1;i<=a;i++)
    s+=i;
  return s;
}
}
