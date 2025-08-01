import java.util.*;
public class FCP004{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int A = in.nextInt();
int B = in.nextInt();

int ADD = A + B;
int SUB = A - B;
int MUL = A*B;
int DIVIDE = A/B;
double FDIVISION = (double)A/B; 
int MOD = A%B;



System.out.println( "The add is " +  ADD );
System.out.println( "The sub is " +  SUB );
System.out.println( "The mul is " +  MUL );
System.out.println( "The divide is " +  DIVIDE );
System.out.println( "The fdivide is " +  FDIVISION );
System.out.println( "The mod is " +  MOD );

}
}