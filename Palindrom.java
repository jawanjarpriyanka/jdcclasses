public class Palindrom{
public static void main(String args[]){
int num=12321;
int oriNo=num;
int revNo=0;
while(num!=0){
revNo=revNo*10+num%10;
num=num/10;
}
if(oriNo==revNo){
System.out.println("gien no is palindrom no");
}else
System.out.println("given no is not palindrom");
}
}