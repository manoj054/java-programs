import java.util.*;
class Even
{
public static void main(String []args)
{
System.out.println("enter any numbers:");
Scanner scan = new Scanner(System.in);
int i=scan.nextInt();
if(i % 2==0)
{
System.out.println("it is a even number");
}
else
{
System.out.println("it is a odd number");
}
}
}