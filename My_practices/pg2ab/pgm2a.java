//inheritance
import java.io.*;
class superclass
{
int x;
int y;
superclass(int x,int y)
{
this.x=x;
this.y=y;
}
}
class subclass extends superclass
{
int x;
int y;
subclass(int x,int y)
{
super(x,y);
this.x=x+200;
this.y=y+100;
}
void display()
{
System.out.println("inherited x="+super.x);
System.out.println("inherited y="+super.y);
System.out.println("local x="+x);
System.out.println("local y="+y);
}
}
class pgm2a
{
public static void main(String args[])
{
subclass obj=new subclass(100,100);
obj.display();
}
}




