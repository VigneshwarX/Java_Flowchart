import java .util.*;
public class FCP017{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();

/*
if(a>b && a>c){
if(b>c){
System.out.println(b);
}
else{
System.out.println(c);
}
}
else if (b>c){
if(a>c){
System.out.println(a);
}
else{
System.out.println(c);
}
}
else if( a>b ){
System.out.println(a);
}
else{
System.out.println(b);
}
*/
int max = 0;
int smax = 0;
if(a>b){
max = a;
smax = b;
}
else{
max = b;
smax = a;
}

if(c>max){
smax = max;
max = c;

}
System.out.println(smax);

}
}