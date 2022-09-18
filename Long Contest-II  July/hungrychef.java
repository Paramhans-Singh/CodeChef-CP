import java.util.Scanner;

public class hungrychef {
    public static void main ( String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for ( int i =0; i<t;i++){
            int X = s.nextInt();
            int Y = s.nextInt();
            int N = s.nextInt();
            int R = s.nextInt();
            if (Y>X){

            if ( R/X<N){
                System.out.println( "-1");
            }
            else if  ( R/Y>=N){
                System.out.print(0+" "+N);
            }
            else {
                int g = Y*N;
                int f = X-Y;
                int m = (R-g)/f;
                if ( (R-g)%f != 0){
                    m++;
                }
                System.out.println(m+" "+(N-m));
            }
        }
    }
}
}
