import java.util.*;
class Divisible_5_11
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
           System.out.printf("\n\t\t\tENTER YOUR NUMBER=");
           int a=sc.nextInt();
          



      if(a%5 ==0)
{
     
      System.out.println("\n\t\t\tNUMBER IS DIVISIBLE BY 5" );
       System.out.println("\n\t\t\t===========================");
}
      else if(a%11 ==0)
{
      System.out.println("\n\t\t\tNUMBER IS DIVISIBLE BY 11");
       System.out.println("\n\t\t\t===========================");
}
     
      else
{
      System.out.println("\n\t\t\tNUMBER NOT DIVISIBLE BY 5 OR 11");
       System.out.println("\n\t\t\t=========================");
}

}
}