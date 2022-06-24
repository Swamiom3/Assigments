import java.util.*;
class Tringle_length
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);

           System.out.printf("\n\t\t\tENTER YOUR 1st length=");
           int a=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 2nd length=");
           int b=sc.nextInt();
           System.out.printf("\n\t\t\tENTER YOUR 3RD length=");
           int c=sc.nextInt();
         


          
      if(a+b <= c || a+c <=b || b+c <= a)
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