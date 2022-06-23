import java.util.*;
class Weight_
{
      public static void main(String[]args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.printf("\n\n\t\t\tTYPE YOUR WEIGHT RANGE POUNDS :-");
       int wt=sc.nextInt();
       


          if(wt<115)
          System.out.println("\n\n\t\t\tTHIS IS FLYWEIGHT");


          else if(wt>115 && wt<=121)
          System.out.println("\n\n\t\t\tTHIS BANTAMWEIGHT");

          else if(wt>122 && wt<=153)
          System.out.println("\n\n\t\t\tTHIS FEATHERWEIGHT");

          else if(wt>154 && wt<=189)
          System.out.println("\n\n\t\t\tTHIS MIDDELWEIGHT");

          else if(wt>=190)
          System.out.println("\n\n\t\t\tTHIS HEAVYWEIGHT");

          else
          System.out.println("\n\n\t\t\tPLEASE ADD VALID NUMBER");



   }
}
       
