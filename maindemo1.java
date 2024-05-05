class multithread2 extends Thread
{
public void run()
{
//Thread.currentThread().setName("Msc.IT");
System.out.println(Thread.currentThread().getName());
}
}
class maindemo1
{
public static void main(String args[])throws Exception
{
for(int i=1;i<=10;i++)
{

multithread2 ob=new multithread2();
Thread t=new Thread(ob);
ob.start();
}

}
}