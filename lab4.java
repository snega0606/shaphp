import java.io.*;
interface mscit
{
boolean prime(int a);
}
class sample implements mscit
{
public boolean prime(int a)
{
boolean flag=false;
for(int i=2;i<a/2;i++)
{
if(a%i==0)
{
flag=true;
break;
}
}
return flag;
}
}
class lab4
{
public static void main(String args[])throws Exception
{
BufferedReader br=newBufferedReader(System.in);
System.out.println("Enter a value");
int a=Integer.parseInt(br.readLine());
sample ob=new sample();
boolean res=ob.prime(a);
if(!res)
System.out.println(a+"is a primeno");
else
System.out.println(a+"is not a primeno");
}
}
