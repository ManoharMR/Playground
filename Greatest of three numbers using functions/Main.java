import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       int ans = gt(a,b,c);
      System.out.println(ans);
	}
  public static int gt (int a, int b, int c)
  {
   int x;
   if(a>b && a>c)
     return a;
   else
   {
     if(b>c)
       return b;
     else
       return c;
   }
   }
  }

