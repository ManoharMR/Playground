import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int i=1,p=1;
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      while(i <= n)
        p*=i++;
      System.out.println(p);
	}
}