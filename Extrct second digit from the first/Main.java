import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        int r, n, rev = 0, fd;

        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        rev /= 10;
      fd = rev % 10;
      System.out.println(fd);
       }
}