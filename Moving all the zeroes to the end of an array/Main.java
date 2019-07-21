import java.util.Scanner;
class Main{
    
    static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;  
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i];
        while (count <n) 
            arr[count++] = 0; 
    } 
    public static void main (String[] args) 
    { 
      int i,j;
      int arr[] = new int[20];
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        
        //int n = arr.length; 
        pushZerosToEnd(arr, n); 
      
        for (i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    }
}