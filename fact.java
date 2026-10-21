import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class fact implements ActionListener
{
JFrame f;
JLabel l1,l2;
JButton b1,b2;
JTextField tf1,tf2;

fact()
{
f=new JFrame("FACTORIAL");
l1=new JLabel("ENTER A NUMBER");
tf1=new JTextField(10);
b1=new JButton("FACTORIAL");
b2=new JButton("CLEAR");
l2=new JLabel("RESULT");
tf2=new JTextField(10);

f.add(l1);
f.add(tf1);
f.add(b1);
f.add(l2);
f.add(tf2);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setLayout(new FlowLayout());
f.setSize(300,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().setBackground(Color.PINK);
l1.setFont(new Font("consolas",Font.BOLD,25));
l1.setForeground(Color.BLUE);
l2.setFont(new Font("consolas",Font.BOLD,25));
l2.setForeground(Color.BLUE);
tf1.setFont(new Font("consolas",Font.BOLD,25));
tf1.setForeground(Color.BLUE);
tf2.setFont(new Font("consolas",Font.BOLD,25));
tf2.setForeground(Color.BLUE);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int fact=1;
int n=Integer.parseInt(tf1.getText());
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
String result=String.valueOf(fact);
tf2.setText(result);
}

if(e.getSource()==b2)
{
tf1.setText(" ");
tf2.setText(" ");
}
}
public static void main(String args[])
{
fact f1=new fact();
}
}
