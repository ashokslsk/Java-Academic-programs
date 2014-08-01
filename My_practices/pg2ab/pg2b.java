import java.io.*;
class rectangle implements area
{
public double compute(double x, double y)
{ return x*y; }
}
class circle implements area
{
public double compute(double x, double y)
{ return PI*x*x; }
}
class pg2b
{
public static void main(String args[])
{
rectangle r1 = new rectangle();
area areaVar;
areaVar = r1;
double r1Val = areaVar.compute(20,40);
System.out.println("Rectangle area is " + r1Val);
circle c1 = new circle();
areaVar = c1;
double c1Val = areaVar.compute(5,4);
System.out.println("Circle area is " + c1Val);
}
}