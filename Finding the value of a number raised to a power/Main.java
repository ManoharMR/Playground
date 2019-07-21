import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int i,j,b,e,out;
      Scanner in = new Scanner(System.in);
      b = in.nextInt();
      e = in.nextInt();
      out=b;
      for(i=2;i<=e;i++)
      {
        out*=b;
      }
      System.out.println(out);
    }
}