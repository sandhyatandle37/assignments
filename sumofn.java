import java.util.Scanner;
class sumofn
{
public static void main(String[] args)
{
Scanner r=new Scanner(System.in);
int a[]=new int[3];
int sum=0;double avg;
System.out.print("enter elements in array: ");
for(int i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("elements in array: ");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
sum=sum+a[i];
}
avg=sum/3;
System.out.println("addition of elements in array:"+sum);
System.out.println("avg of elements in array:"+avg);
}}
