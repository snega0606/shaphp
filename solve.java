import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class solve extends JFrame implements ItemListener {
 
    // frame
    static JFrame f;
 
    // label
    static JLabel l, l1;
 
    // combobox
    static JComboBox c1;
 
    // main class
    public static void main(String[] args)
    {
        // create a new frame
        f = new JFrame("frame");
 
        // create a object
        solve s = new solve();
 
        // set layout of frame
        f.setLayout(new FlowLayout());
 
        // array of string containing cities
        String selectprogram[] = { "lab1", "lab2", "lab3", "lab4", "lab5","lab6" };
 
        // create checkbox
        c1 = new JComboBox(selectprogram);
 
        // add ItemListener
        c1.addItemListener(selectprogram);
 
        // create labels
        l = new JLabel("select program ");
        l1 = new JLabel("E:\ss\lab1.java	");
 
        // set color of text
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);
 
        // create a new panel
        JPanel p = new JPanel();
 
        p.add(l);
 
        // add combobox to panel
        p.add(c1);
 
        p.add(l1);
 
        // add panel to frame
        f.add(p);
 
        // set the size of frame
        f.setSize(400, 300);
 
        f.show();
    }
    public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == c1) {
 
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }
}
