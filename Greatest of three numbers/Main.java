import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
      Scanner num = new Scanner(System.in);
      int a = num.nextInt();
      int b = num.nextInt();
      int c = num.nextInt();
      if(a>b && a>c)
        System.out.println(a);
      else
      {
        if(b>c)
          System.out.println(b);
        else
          System.out.println(c);
      }
    }
}