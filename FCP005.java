import java.util.*;
public class FCP005{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int A = in.nextInt();
int B = in.nextInt();

double c = (double) A/B;
 
int d = A%B;



System.out.println( "The quotient is " +  c );
System.out.println( "The remainder is " +  d );


}
}