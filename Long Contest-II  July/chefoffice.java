import java.util.Scanner;

public class chefoffice{
    public static void main( String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for ( int i=0;i<t;i++){
            int X = s.nextInt();
            int Y = s.nextInt();
            if ( Y < X ){
                System.out.println(4*X+Y);
            }
        }
        
    }
}