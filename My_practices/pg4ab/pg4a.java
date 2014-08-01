import java.io.*;
import java.applet.*;
import java.awt.*;
/*<applet code="pg4.class" height=400 width=500>
</applet>*/

public class pg4a extends Applet implements Runnable
{
String str;
int x,y;
public void init()
{
str = "This is a Running Text";
x = 300;
new Thread(this).start();
}
public void run()
{
try
{
for(;;)
{
x -= 10;
if(x < 10)
{ x = 300; }
repaint();
System.out.println(x);
Thread.sleep(1000);
}
}
catch(Exception e) {}
}
public void paint(Graphics g)
{
for(int i=0;i<10;i++)
g.drawString(str,x,100);
}
}
