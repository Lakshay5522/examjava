import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CGUI implements ActionListener
{
JFrame f;
JLabel l1,l2,l3;
JTextField tf1,tf2,tf3;
JButton b1,b2,b3,b4,b5;

CGUI()
{
f=new JFrame("calculator");
l1=new JLabel("Enter the first Integer:");
tf1=new JTextField(10);
l2=new JLabel("Enter the second Integer:");
tf2=new JTextField(10);
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("x");
b4=new JButton("/");
b5=new JButton("Clear");
l3=new JLabel("Result");
tf3=new JTextField(10);

f.add(l1);
f.add(tf1);
f.add(l2);
f.add(tf2);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(l3);
f.add(tf3);

f.setSize(300,400);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().setBackground(Color.YELLOW);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

l1.setFont(new Font("consolas",Font.PLAIN,50));
l2.setFont(new Font("consolas",Font.PLAIN,50));
l3.setFont(new Font("consolas",Font.PLAIN,50));
tf1.setFont(new Font("consolas",Font.PLAIN,50));
tf2.setFont(new Font("consolas",Font.PLAIN,50));
tf3.setFont(new Font("consolas",Font.PLAIN,50));
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{

String s1=tf1.getText();
String s2=tf2.getText();
float m=Float.parseFloat(s1);
float n=Float.parseFloat(s2);
String r=String.valueOf(m+n);
tf3.setText(r);
tf3.setEditable(false);
}

if(e.getSource()==b2)
{

String s1=tf1.getText();
String s2=tf2.getText();
float m=Float.parseFloat(s1);
float n=Float.parseFloat(s2);
String r=String.valueOf(m-n);
tf3.setText(r);
tf3.setEditable(false);
}

if(e.getSource()==b3)
{

String s1=tf1.getText();
String s2=tf2.getText();
float m=Float.parseFloat(s1);
float n=Float.parseFloat(s2);
String r=String.valueOf(m*n);
tf3.setText(r);
tf3.setEditable(false);
}

if(e.getSource()==b4)
{

String s1=tf1.getText();
String s2=tf2.getText();
float m=Float.parseFloat(s1);
float n=Float.parseFloat(s2);
String r=String.valueOf(m/n);
tf3.setText(r);
tf3.setEditable(false);
}

if(e.getSource()==b5)
{
tf1.setText(" ");
tf2.setText(" ");
tf3.setText(" ");
}

}

public static void main(String args[])
{
CGUI c1=new CGUI();
}
}
