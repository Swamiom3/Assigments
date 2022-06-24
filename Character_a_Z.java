import java.util.*;
class Character_a_Z
{
         public static void main(String[]args)
          {
           Scanner sc=new Scanner(System.in);
          
           
           System.out.printf("\n\t\t\tENTER YOUR CHARACTER =");
          char ch=sc.next().charAt(0);

           
          



      if(ch >= 'a' && ch <= 'z' )
{
     
      System.out.println("\n\t\t\tCHARACTER IS SMALL" );
       System.out.println("\n\t\t\t===========================");
}
    
      else if (ch >= 'A' && ch <= 'Z')
{
      System.out.println("\n\t\t\tCHARACTER IS ALFABET");
       System.out.println("\n\t\t\t=========================");
}
      else 
  {
      System.out.println("\n\t\t\tPLEASE ENTER VALID CHAR");
       System.out.println("\n\t\t\t=========================");
   }
    

}
}