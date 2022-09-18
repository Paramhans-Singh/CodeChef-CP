import java.util.Scanner;

public class Todivide {
    public static void main( String[] args) {

        // Scanner s = new Scanner(System.in);
        // int t = s.nextInt();
        // for ( int i=0;i<t;i++){
        //     int A=s.nextInt();
        //     int B = s.nextInt();
        //     int N =s.nextInt();
        //     int num = N ;
        //     if ( A ==B ){
        //        System.out.println("-1");
        //     }
            
        //     int a =100000000;
        //     while ( num >=N  && num<a ){
        //      if ( num % A ==0 && num % B !=0){
        //       System.out.println(num);
        //       break;
        //      } 

        //      num++;
        //     }

        // }
        
//new method lagana tha to achieve this as in mine code i am trying with all the numbers like say n to 10^9 but in this i am trying 
// at n then n+a so operations will be less 
		Scanner scanner = new Scanner(System.in);
		int num_cases = scanner.nextInt();
		
		for(int i = 0 ; i < num_cases ; i++)
		{
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int n = scanner.nextInt();
		    
		    if(n % a == 0 && n % b != 0)
		    {
		        System.out.println(n);
		    }
		    else
		    {
		        int smallest_number = n + a - (n % a);
    		    if(smallest_number % b != 0)
    		    {
    		        System.out.println(smallest_number);
    		    }
    		    else
    		    {
    		        smallest_number += a;
    		        if(smallest_number % b != 0)
        		    {
        		        System.out.println(smallest_number);
        		    }
        		    else
        		    {
        		        System.out.println(-1);
        		    }
    		    }
		    }
		    
		    
		}
	}
}
