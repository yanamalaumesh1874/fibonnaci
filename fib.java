import java.util.*;
class Fab
{
public static void main(String args[])
{
int i,f=0,f1=0,f2=1;
System.out.println("enter the n value");
int n=(new Scanner(System.in)).nextInt();
System.out.println(f1+f2);
for(i=0;i<n;i++)
{
 f=f1+f2;
f1=f2;
f2=f;
System.out.println(f);
}
}
}
