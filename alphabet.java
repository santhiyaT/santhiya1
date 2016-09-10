import java.util.Scanner;
class Vowels{
public static void main(String[] args){
 char c;
 Scanner a=new Scanner(System.in);
 System.out.println("Enter the letter:");
c=a.next().charAt(0);
 if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
       System.out.println("c is an alphabet");
       else 
       System.out.println("c is not an alphabet");
        }
        }
