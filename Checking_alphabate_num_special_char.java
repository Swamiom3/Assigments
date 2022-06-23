import java.util.*;
class Checking_alphabate_num_special_char
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any from keyboard:");
  char ch=sc.next().charAt(0);
  if(ch>='a'  && ch<='z')
  {
    System.out.println("it is small alphabate");
  }
   else if (ch>='A'  && 'Z'>=ch)
  {
    System.out.println("it is capital alphabate");
  }
 else if (ch>='1'&& '9'>=ch)
  {
    System.out.println("it is number");
  }
 
else
  {
System.out.println("it is special character");
  }
}
}