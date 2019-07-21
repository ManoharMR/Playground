import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      int i=0,s=0;
      Scanner n = new Scanner(System.in);
      int num = n.nextInt();
      for(i = 1;i <= num; i++)
        s+=i;
      System.out.print(s);
	}
}