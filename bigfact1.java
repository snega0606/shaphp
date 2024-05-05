import java.math.*;
import java.io.*;
class bigfact1
{
public static void main(String args[])
{
int i, d=100;
BigInteger bi=new BigInteger("i");
for(i=1;i<=d;i++)
{
bi=bi.multiply(BigInteger.value of(i));
}
System.out.println("The factorial of a number is:" +bi);
}
}
