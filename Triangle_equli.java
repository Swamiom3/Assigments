import java.util.*;
class Triangle_equli
{
      public static void main(String[]args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.printf("\n\n\t\t\tTYPE YOUR SIDE 1st LENGTH :-");
       int side1=sc.nextInt();
       System.out.printf("\n\n\t\t\tTYPE YOUR SIDE 2nd LENGTH :-");
       int side2=sc.nextInt();
       System.out.printf("\n\n\t\t\tTYPE YOUR SIDE 3rd LENGTH :-");
       int side3=sc.nextInt();


          if(side1!=side2  && side1!=side3 && side2!=side3)
          System.out.println("\n\n\t\t\tTHIS IS SCALENCE TRIANGLE");


          else if(side1==side2 && side1==side3 && side2==side3)
          System.out.println("\n\n\t\t\tTHIS IS EQUILATERAL TRIANGLE");


          else if (side1==side2 || side2==side3 && side2!=side3)
          System.out.println("\n\n\t\t\tTHIS IS ISOLENCE TRIANGLE");

          else
          System.out.println("\n\n\t\t\tPLEASE ADD VALID NUMBER");



   }
}
       
