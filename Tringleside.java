import java.util.*;
class Tringleside
{
      public static void main(String[]args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.printf("\n\n\t\t\tTYPE YOUR SIDE 1st LENGTH");
       int side1=sc.nextInt();
       System.out.printf("\n\n\t\t\tTYPE YOUR SIDE 2nd LENGTH");
       int side2=sc.nextInt();
       System.out.printf("\n\n\t\t\tTYPE YOUR SIDE 3rd LENGTH");
       int side3=sc.nextInt();


if((side1+side2>side3) && (side1+side3>side2) || (side2+side3>side1))
System.out.println("\n\n\t\t\tTHIS IS VALID TRIANGLE");

else
System.out.println("\n\n\t\t\tTHIS IS NOT VALID TRIANGLE");

   }
}
       
