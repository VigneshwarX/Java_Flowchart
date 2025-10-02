import java .util.*;
public class FCP039{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = in.nextInt();
int max = a;
int min = a;

for(int i = 2;i<=n;i++){
int b = in.nextInt();
if(b>max){
max=b;
}
if(min>b){
min=b;
}
}
System.out.println(max);
System.out.println(min);
}
}



