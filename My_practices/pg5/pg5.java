package My_practices.pg5;
import java.awt.Graphics;
import java.awt.event.*;
import java.applet.*;
public class pg5 extends Applet implements MouseListener, MouseMotionListener
{
String msg = " ";
int mouseX = 0, mouseY = 0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouseX = 0;
mouseY = 10;
msg = "Mouse Clicked";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX = 0;
mouseY = 10;
msg = "Mouse Clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mouseX = 0;
mouseY = 10;
msg = "Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX = 0;
mouseY = 10;
msg = "Mouse is Exiting the Window";
repaint();
}
public void mousePressed(MouseEvent me)
{
mouseX = me.getX();
mouseY = me.getY();
msg = "Mouse Pressed";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouseX = me.getX();
mouseY = me.getY();
msg = "*";
showStatus("Dragging Mouse At " + mouseX + ": " + mouseY);
repaint();
}
public void mouseMoved(MouseEvent me)
{
mouseX = me.getX();
mouseY = me.getY();
msg = "*";
showStatus("Mouse moving At " + mouseX + ": " + mouseY);
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg, mouseX, mouseY);
}
}