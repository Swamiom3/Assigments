import java.util.*;
class Asciivalue
{
public static void main(String[]arge)
{
Scanner sc=new Scanner(System.in);
System.out.printf("\n\n\t\t\tENTER YOUR ANY CHARACTER :-");
char CH=sc.next().charAt(0);

if (CH > 65 && CH<=90)

System.out.println("\n\n\t\t\tTHIS ALPHABET IS CAPITAL LETTER");

else if (CH >=97 && CH<=122)

System.out.println("\n\n\t\t\tTHIS ALPHABET IS SNALL LETTER");

else if (CH > 48 && CH<=57)

System.out.println("\n\n\t\t\tTHIS IS NUMBER");

else if (CH > 58 && CH<=64 || CH>=0 && CH <=47 || CH >=91 && CH <=96 || CH >=123 && CH<=127)

System.out.println("\n\n\t\t\tTHIS IS SPECIAL CHARACTER");

}
}






