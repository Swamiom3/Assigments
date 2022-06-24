import java.util.*;
class Threenum_max
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
           System.out.printf("\n\t\t\tENTER YOUR FIRST NUMBER=");
           int a=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 2nd NUMBERS=");
           int b=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 3rd  NUMBERS=");
           int c=sc.nextInt();



      if(a>b && a>c)
{
     
      System.out.println("\n\t\t\tNUMBER A IS GREATER THAN B AND C" );
       System.out.println("\n\t\t\t===========================");
}
      else if(b>a && b>c)
{
      System.out.println("\n\t\t\tNUMBER B IS GREATHER THAN A AND C");
       System.out.println("\n\t\t\t===========================");
}
     
      else if(c>a && c>b)
{
      System.out.println("\n\t\t\tNUMBER C IS GREATHER THAN A AND B");
       System.out.println("\n\t\t\t=========================");
}

      else 
      System.out.println("\n\t\t\tplease enter valid number");
       System.out.println("\n\t\t\t=========================");
}
}