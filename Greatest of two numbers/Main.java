import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
      int a = num.nextInt();
      int b = num.nextInt();
      if(a>b)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}