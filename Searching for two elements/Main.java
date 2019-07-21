import java.util.Scanner;
public class Main {
       public static int  findIndex (int[] a, int t) {
        if (a == null) 
          return -1;
        int len = a.length;
        int i = 0;
        while (i < len) {
            if (a[i] == t) 
              return i;
            else 
              i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
          a[i] = s.nextInt();
      int x = s.nextInt();
      int y = s.nextInt();
      
      System.out.println(findIndex(a, x));
      System.out.println(findIndex(a, y));
       }
}