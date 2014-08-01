//inner-oter class
import java.io.*;
class outer
{
	int x=100;
	inner inob=new inner();
	void display()
	{
		System.out.println("instance variables in outer class");
		System.out.println("outer x="+x);
		System.out.println("inner x="+inob.x);
	}
	class inner
	{
		int x=200;
		void display()
		{
			System.out.println("instance variables in inner class");
			System.out.println("inner x="+x);
			System.out.println("outer x="+outer.this.x);
		}
	}
}
class pgm1b
{
	public static void main(String args[])
	{
		outer obj1=new outer();
		obj1.display();
		outer.inner obj2=new outer().new inner();
		obj2.display();
	}
}




