import java.net.*;
import java.io.*;
public class serverchat
{
public static void main(String args[])throws Exception
{
String x;
ServerSocket ss = new ServerSocket(2000);
Socket s=ss.accept();
while(true)
{
System.out.println("server message");
DataInputStream dis=new DataInputStream(System.in);
x=dis.readLine();
DataOutputStream dos= new DataOutputStream(s.getOutputStream());
dos.writeUTF(x);
if(x.equals("bye"))
System.exit(0);
System.out.println("Client Message");
DataInputStream dis1=new DataInputStream(s.getInputStream());
String c = dis1.readUTF();
System.out.println(c);
if(c.equals("bye"))
System.exit(0);
}}}
