public class ReverseNoEx{
public static void main(String args[]){
 int a=123;
int revNo=0;
while(a!=0){
int rem=a%10;
revNo=revNo*10+rem;
a=a/10;
}
System.out.println(revNo);
}
}