import java.util.*;
class Tringle
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);

           System.out.printf("\n\t\t\tENTER YOUR 1st ANGLE=");
           int a=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 2nd ANGLE=");
           int b=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 3RD ANGLE=");
           int c=sc.nextInt();
           
            int angle;
                angle=a+b+c;


          
      if(angle == 180)
{

       System.out.println("\n\t\t\tTHIS TRIANGLE IS VALID");
       System.out.println("\n\t\t\t=======================");

}
     else
{
       System.out.println("\n\t\t\tNOT VALID TRIABGLE");
       System.out.println("\n\t\t\t=======================");
}


}
}