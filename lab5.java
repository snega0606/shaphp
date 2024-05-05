import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class lab5 extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1;
login()
{
super("login");
setLayout(new GridLayout(3,2));
l1=new Label("Username");
l2=new Label("Password");
t1=new TextField(15);
t2=new TextField(15);
t2.setEchoChar('*');
b1=new Button("Login");
add(l1);
add(l2);
add(t1);
add(t2);
b1.addActionListener(this);
setSize(200,200);
setVisible(true);
}
public static void main(String args[])
{
new login();
}
public void actionperformed(ActionEvent ae)
{
String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("idc")&&s2.equalsIgnoreCase("idc"))
Joptionpane.ShowMessageDialog(null,"Successfully logged in");
else
Joptionpane.ShowMessageDialog(null,"Login failed");
}
}

