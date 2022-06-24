import java.util.*;
class Vowel_
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
          
           
           System.out.printf("\n\t\t\tENTER YOUR CHARACTER =");
          char ch=sc.next().charAt(0);

           
          



      if(ch == 'a' || ch== 'e' || ch== 'i' || ch=='o' || ch=='u')

{
    
     
      System.out.println("\n\t\t\tCHARACTER IS VOWEL" );
       System.out.println("\n\t\t\t===========================");

     
}
    else if(ch == 'A' || ch== 'E' || ch== 'I' || ch=='O' || ch=='U')
{
     
      System.out.println("\n\t\t\tCHARACTER IS VOWEL" );
       System.out.println("\n\t\t\t===========================");
}
      else
{
      System.out.println("\n\t\t\tCHARACTER IS NOT VOWEL IT IS CONSQENT");
       System.out.println("\n\t\t\t=========================");
}

}
}