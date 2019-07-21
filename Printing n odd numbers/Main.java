import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) 
    {
      Scanner num = new Scanner(System.in);
      int limit = num.nextInt();
		
		
		
		for(int i=1; i <= 2*limit; i++){
			
			//if the number is not divisible by 2 then it is odd
			if( i % 2 != 0){
				System.out.println(i);
			}
		}
	}
}