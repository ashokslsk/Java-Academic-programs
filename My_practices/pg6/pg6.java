import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class pg6 extends JFrame implements ActionListener
{
JTextField studname, studreg, studcourse;
JLabel name, reg, course;
JFrame frame;
JButton save, exit;
Container contentPane;
pg6()
{
contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
frame = new JFrame("Student form");
frame.setSize(280,230);
name = new JLabel("Name");
reg = new JLabel("Register");
course = new JLabel("Course");
studname = new JTextField(15);
studreg = new JTextField(15);
studcourse = new JTextField(15);
Panel p1 = new Panel();
p1.add(name);
p1.add(studname);
contentPane.add(p1);
Panel p2 = new Panel();
p2.add(reg);
p2.add(studreg);
contentPane.add(p2);
Panel p3 = new Panel();
p3.add(course);
p3.add(studcourse);
contentPane.add(p3);
save = new JButton("Save");
exit = new JButton("Exit");
Panel p4 = new Panel();
p4.add(save);
p4.add(exit);
contentPane.add(p4);
Panel p5 = new Panel();
contentPane.add(p5);
frame.getContentPane().add(contentPane,"Center");
save.addActionListener(this);
exit.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str = ae.getActionCommand();
if(str.equals("Save"))
{
String name = studname.getText();
String course = studcourse.getText();
String reg = studreg.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn = DriverManager.getConnection("jdbc:odbc:test",
"root", "relevantio");
Statement st = conn.createStatement();
String sqlstr="Insert into student1
values('"+name+"','"+course+"','"+reg+"');";
System.out.println(sqlstr);
int rows = st.executeUpdate(sqlstr);
JOptionPane.showMessageDialog(null, rows + "rows updated");
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(null, "SQL code did not Execute...
check Syntax");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, "Exception encountered");
}
}
if(str.equals("Exit"))
{
System.exit(0);
}
}
public static void main(String args[])
{
pg6 stud = new pg6();
stud.frame.setVisible(true);
stud.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


create database s7;
use s7;
create table student1(name varchar(20), usn varchar(20) primary key, course varchar(15));