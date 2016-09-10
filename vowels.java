import java.util.Scanner;
class Vowels{
public static void main(String[] args){
 char letter;
 Scanner a=new Scanner(System.in);
 System.out.println("Enter the letter:");
 letter=a.next().charAt(0);
 if(letter=='e'||letter=='E'||letter=='a'||letter=='A'||letter=='i'||letter=='I'||letter=='o'||letter=='O'||letter=='u'||letter=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
        }
        }
