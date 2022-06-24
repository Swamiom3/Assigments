import java.util.*;
class Leapyear_
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
           System.out.printf("\n\t\t\tENTER YOUR YEAR =");
           int year=sc.nextInt();
          



      if(year%4 ==0)
{
     
      System.out.println("\n\t\t\tNUMBER IS LEAP YEAR" );
       System.out.println("\n\t\t\t===========================");
}
      else
{
      System.out.println("\n\t\t\tNUMBER IS NOT LEAP YEAR");
       System.out.println("\n\t\t\t=========================");
}

}
}