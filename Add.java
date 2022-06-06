import java.util.Scanner;
public class Add{
public static void main(String[] args){
int a;
int b;
int sum;
Scanner sc= new Scanner(System.in);
System.out.println("Enter 1st no");
a=sc.nextInt();
System.out.println("Enter 2nd no");
b=sc.nextInt();
sum=a+b;
System.out.println("sum of two digit is:"+sum);
}
}