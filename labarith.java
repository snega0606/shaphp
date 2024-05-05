import java.io.*;
import p1.arithmetic;
class labarith
{
public static void main(String args[])throws Exception
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a & b values");
int a =Integer.parseInt(br.readLine());
int b= Integer.parseInt(br.readLine());
arithmetic ob=new arithmetic();
ob.add(a,b);
ob.sub(a,b);
ob.mul(a,b);
ob.div(a,b);
}
}