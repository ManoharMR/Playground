import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner n= new Scanner(System.in);
      int num = n.nextInt();
	     int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum); 
	}
}