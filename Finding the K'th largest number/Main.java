import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      int i,j,max=0;
      int a[] = new int[10];
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(i=0; i<n ; i++)
        a[i] = in.nextInt();
      int k = in.nextInt();
      max = a[0];
      for(i=0;i<n;i++)
        for (j=i;j<n;j++)       
          if(a[i]<a[j])
          {
          max=a[i];
          a[i] = a[j];
          a[j] = max;
        }
      System.out.println(a[k-1]);
    }   
}