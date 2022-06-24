import java.util.*;
class TRiangle_
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);

           System.out.printf("\n\t\t\tENTER YOUR 1st length=");
           int side1=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 2nd length=");
           int side2=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 3RD length=");
           int side3=sc.nextInt();
         


          
      if(side1!=side2 && side1!=side3)
{

       System.out.println("\n\t\t\tTHIS IS SCALENCE TRIANGLE");
       System.out.println("\n\t\t\t=======================");

}
     else if (side1==side2 && side2==side3 && side1 != side3)
{
       System.out.println("\n\t\t\tTHIS IS ISOLECE TRANGLD");
       System.out.println("\n\t\t\t=======================");
}
     
     else if (side1==side2 && side2==side3 && side1 == side3)
{
       System.out.println("\n\t\t\tTHIS IS EQUILATERAL TRANGLE");
       System.out.println("\n\t\t\t=======================");
}


}
}