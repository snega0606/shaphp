import java.io.*;
class lab2
{
static int MAX_CHAR=256;
static void occur(String str)
{
int count[]=new int[MAX_CHAR];
int len=str.length();
for(int i=0;i<len;i++)
{
count[str.charAt(i)]++;
}
char ch[]=new char[str.length()];
for(int i=0;i<len;i++)
{
ch[i]=str.charAt(i);
int find=0;
for(int j=0;j<=i;j++)
{
if(str.charAt(i)==ch[j])
find ++;
}
if(find==1)
{
System.out.println("Number of occurence of  "+str.charAt(i)+" is: "+count[str.charAt(i)]);
}
}
}
public static void main(String args[])throws Exception
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a string");
String str=br.readLine();
occur(str);
}
}
