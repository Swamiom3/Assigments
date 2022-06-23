import java.util.*;
class Leapyaer
{
      public static void main(String[]args)
{
       Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\t\t\tENTER YOUR YEAR");
          int year=sc.nextInt();

         if(((year%4==0) && (year%100 !=0)) || (year %400==0))
         System.out.println("\n\n\t\t\tTHIS YEAR IS LEAP YEAR");

        else
      System.out.println("\n\n\t\t\tTHIS IS NOT LEAP YEAR");

}
}





