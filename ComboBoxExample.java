import javax.swing.*;    
import java.awt.event.ItemListener.*;
public class ComboBoxExample {    
JFrame f;
ComboBoxExample(){    
    f=new JFrame("ComboBox Example");    
    String program[]={"lab1","lab2","lab3","lab4","lab5","lab6"};        
    JComboBox cb=new JComboBox(program);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);    
}
public static void main(String[] args) {    
    new ComboBoxExample();         
}    
}


// this is a sample to pull the file from the git.
 f=new JFrame("ComboBox Example");    
    String program[]={"lab1","lab2","lab3","lab4","lab5","lab6"};        
    JComboBox cb=new JComboBox(program);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);    
