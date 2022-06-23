import java.util.*;
class LightbillUnit
    {
   public static void main(String[]args)
    {
     Scanner in=new Scanner(System.in);

System.out.printf("\n\n\t\t\tENTER YOUR LIGHT UNITS ");

     double unit=in.nextDouble();

    

if(unit <= 50)

{
double bill=unit*0.50;
System.out.println("\n\n\t\t\t THIS IS YOUR MONTHALY BILL:-"+bill);
}

else if(unit > 50 && unit <=150)

{
double bill=unit*0.75;
System.out.println("\n\n\t\t\t THIS IS YOUR MONTHALY BILL:-"+bill);
}

else if(unit > 150 && unit <=250)

{
double bill=unit*1.20;
System.out.println("\n\n\t\t\t THIS IS YOUR MONTHALY BILL:-"+bill);
}

else if(unit > 250)

{
double bill=unit*1.50;
System.out.println("\n\n\t\t\t THIS IS YOUR MONTHALY BILL:-"+bill);

}

else
System.out.println("\n\n\t\t\tPLEASE ENTER UNIT IN NUMBER");

}
}