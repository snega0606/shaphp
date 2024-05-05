class labm1
{
public static void main(String args[])
{
int r,l,b,a,p;
double pi=3.14;
double ac,pc;
r=Integer.parseInt(args[0]);
l=Integer.parseInt(args[1]);
b=Integer.parseInt(args[2]);
ac=pi*r*r;
pc=2*pi*r;
a=l+b;
p=2*(l+b);
System.out.println("area of a circle:"+ac);
System.out.println("perimeter of a circle:"+pc);
System.out.println("area of a rectangle:"+a);
System.out.println("perimeter of a rectangle:"+p);
}
}
