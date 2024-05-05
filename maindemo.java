class multithread2 extends Thread
{
public void run()
{
//Thread.currentThread().setName("Msc.IT");
System.out.println(Thread.currentThread().getName());
}
}
class maindemo
{
public static void main(String args[])throws Exception
{
multithread2 ob=new multithread2();
//Thread t=new Thread(ob);
ob.start();
}
}