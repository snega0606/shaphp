package p1;
public class arithemetic
{
public void add(int a,int b)
{
System.out.println("the addition is"+(a+b));
}
public void sub(int a,int b)
{
System.out.println("the subraction is"+(a-b));
}
public void mul(int a,int b)
{
System.out.println("the multiplication is"+(a*b));
}
public void div(int a,int b)
{
System.out.println("the division is"+(a/b));
}

import java.io.*;
import p1.arithemetic;
class lab3
{
public static void main(String args[])throws Exception
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
