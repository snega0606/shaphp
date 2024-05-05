import java.io.*;
class labcr
{
void circle(int r)
{
double ac=3.14133*r*r;
double pc=2*3.1413*r;
System.out.println("Area of a circle"+ac);
System.out.println("Perimeter of a circle"+pc);
}
void rectangle(int l, int b)
{
double ar=l*b;
double pr=2*l+b;
System.out.println("Area of a rectangle"+ar);
System.out.println("Perimeter of a rectangle"+pr);
}
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter radius,length and breath value:");
int r=Integer.parseInt(br.readLine());
int l=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
labcr ob = new labcr();
ob.circle(r);
ob.rectangle(l,b);
}
}
