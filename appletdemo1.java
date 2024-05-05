/*<applet code="appletdemo1" width="200" height="300"></applet>*/
import java.awt.*;
import java.applet.*;
public class lab6 extends Applet
{
Image i;
public void init()
{
i=getImage(getCodeBase(),"screenshot(1).png");
}
public void paint(Graphics g)
{
g.drawImage(i,30,40,this);
}
}
