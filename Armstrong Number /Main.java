import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int originalNumber, remainder, result = 0;
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}