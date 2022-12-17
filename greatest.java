import java.util.Scanner;
class greatest
{
public static void main(String[] args)
{
int a,b,c;
System.out.println("enter three numbers: ");
Scanner r=new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
c=r.nextInt();
if(a>b)
{
if(a>c)
System.out.print(a+"is greatest number ");
else
System.out.print(c+"is greatest number ");
}
else {
if(b>c)
System.out.print(b+" is not positive ");
else
System.out.print(c+"is greatest number ");
}
}}