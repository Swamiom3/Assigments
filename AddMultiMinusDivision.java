import java.util.*;
class AddMultiMinusDivision
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.printf("\n\n\t\t\tCALCULATOR");
System.out.println("\n\n\t\t\t====================");
System.out.println("\n\n\t\t\tENTER YOUR CHOICE"+"\n"+"\t\t\t1:-ADD "+"\n"+"\t\t\t2:-SUB"+"\n"+"\t\t\t3:-MULTI"+"\n"+"\t\t\t4:-DIV");
System.out.println("\n\n\t\t\tENTRR YOUR TWO NUMBERS");
System.out.println("\n\n\t\t\tENTER YOUR CHOICE");
int choice=sc.nextInt();


if(choice==1)
{
int a,b,c;
System.out.println("\n\n\t\t\tENTER YOUR VALUES");
 a=sc.nextInt();
 b=sc.nextInt();
c=a+b;
System.out.println("\n\n\t\t\tTHIS IS YOUR ADDITION OF TWO VALUES:-"+c);
System.out.println("\n\n\t\t\t=======================================");

}

else if(choice==2)
{
int a,b,d;
System.out.println("\n\n\t\t\tENTER YOUR VALUES");
 a=sc.nextInt();
 b=sc.nextInt();
d=a-b;
System.out.printf("\n\n\t\t\tTHIS IS YOUR SUBSTRACTION OF TWO VALUES:-"+d);
System.out.println("\n\n\t\t\t===========================================");

}

else if(choice==3)
{
int a,b,e;
System.out.println("\n\n\t\t\tENTER YOUR VALUES");
 a=sc.nextInt();
 b=sc.nextInt();
e=a*b;
System.out.printf("\n\n\t\t\tTHIS IS YOUR MULTIPLICATION OF TWO VALUES:-"+e);
System.out.println("\n\n\t\t\t=============================================");

}

if(choice==4)
{
int a,b,f;
System.out.println("\n\n\t\t\tENTER YOUR VALUES");
a=sc.nextInt();
b=sc.nextInt();
f=a/b;
System.out.printf("\n\n\t\t\tTHIS IS YOUR DIVISION OF TWO VALUES:-"+f);
System.out.println("\n\n\t\t\t=======================================");

}



}
}





