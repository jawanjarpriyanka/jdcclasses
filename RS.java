public class RS{
public static void main(String args[]){
String a="sonu";
String b="";
//int l=a.length()-1;
for(int i=a.length()-1;i>=0;i--){

b=b+a.charAt(i);
}

System.out.println("reverse string of ginen is="+b);

if(a.equals(b)){
            System.out.println("given string is palindrom");
    }else{
           System.out.println("givrn string is not palindrom");
          }
}
}