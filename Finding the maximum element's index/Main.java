import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int i,j=0,m=0;
    int a[] = new int[20];
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    m=a[0];
    for(i=0;i<n;i++)
      if(m<a[i])
      {
        m=a[i];
        j=i;
      }
    System.out.println(j);
  }
}