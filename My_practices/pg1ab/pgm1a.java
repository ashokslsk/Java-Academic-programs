//overloading program
import java.io.*;
class test
{
int x;
test()
{
x=0;
}
test(int a)
{
x=a;
}
int display()
{
return x;
}
int add()
{
return(x+10);
}
int add(int a)
{
return(x+a);
}
}
class pgm1a
{
public static void main(String args[])
{
test obj1=new test();
test obj2=new test(5);
System.out.println("obj1.x="+obj1.display());
System.out.println("obj2.x="+obj2.display());
System.out.println("after adding 10,obj1.x="+obj1.add());
System.out.println("after adding obj1.x="+obj1.add(10));
System.out.println("after adding obj2.x="+obj2.add());
System.out.println("after adding obj2.x="+obj2.add(10));
}
}






