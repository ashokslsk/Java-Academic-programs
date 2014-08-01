/* pg4b.java */
import java.io.*;
import java.applet.*;
import java.awt.*;
/* <applet code="pg4a.class" height=300 width=800>
<param name = fontName value = Courier>
<param name = fontSize value = 14>
<param name = leading value = 12>
<param name = accountActive value = true>
</applet>
*/
public class pg4b extends Applet
{
String fontNameVal;
int fontSizeVal;
float leadingVal;
boolean accountActiveVal;
public void start()
{
String param;
fontNameVal = getParameter("fontName");
if(fontNameVal == null)
fontNameVal = "Not Found";
param = getParameter("fontSize");
try
{
if(param != null)
fontSizeVal = Integer.parseInt(param);
else
fontSizeVal = 0;
}
catch(NumberFormatException e)
{ fontSizeVal = -1; }
param = getParameter("leading");
try
{
if(param != null)
leadingVal = Float.valueOf(param).floatValue();
else
leadingVal = 0;
}
catch(NumberFormatException e)
{ leadingVal = -1; }
param = getParameter("accountActive");
if(param != null)
accountActiveVal = Boolean.valueOf(param).booleanValue();
}
public void paint(Graphics g)
{
g.drawString("Font Name: " + fontNameVal, 0, 10);
g.drawString("Font Size: " + fontSizeVal, 0, 26);
g.drawString("Leading: " + leadingVal, 0, 42);
g.drawString("Account Active: " + accountActiveVal, 0, 58);
}
}