import java.util.*;
 
public class Main{
 
    public static void main(String []args)
    {
        int n=0,i=0;
         
        Scanner X = new Scanner(System.in);
         
        //System.out.print("Enter value n : ");
        n = X.nextInt();
         
        for(i=1; i<n+1; i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }   
        //System.out.println();
         
    }
}