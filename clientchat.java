import java.net.*;
import java.io.*;
public class clientchat
{
public static void main(String args[])throws Exception
{
String st;
Socket s = new Socket("localhost",2000);
while(true)
{
System.out.println("server message");
DataInputStream dis = new DataInputStream(s.getInputStream());
String c=dis.readUTF();
System.out.println(c);
if(c.equals("bye"))
System.exit(0);
System.out.println("client message");
DataInputStream dis1 = new DataInputStream(System.in);
st=dis1.readLine();
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
dos.writeUTF(st);
if(st.equals("bye"))
System.exit(0);
}
}
}
