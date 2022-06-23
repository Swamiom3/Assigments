import java.util.*;
class Profitloss
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.printf("\n\n\t\t\tPLEASE ENTER YOUR selling VALUE:-");
int sp=sc.nextInt();

System.out.printf("\n\n\t\t\tPLEASE ENTER YOUR cost VALUE:-");
int cp=sc.nextInt();



if (sp-cp>0)
{
int profit=sp-cp;
System.out.println("\n\n\t\t\tCONGRATULATIONS YOU ARE IN PROFIT:-"+profit);
}

else if (sp-cp<0)
{
int loss=sp-cp;
System.out.println("\n\n\t\t\tYOU ARE IN LOSS:-"+loss);
}

else
System.out.println("\n\n\t\t\tYOU ARE NOT IN PROFIT OR NOT IN LOSS");
}
}
