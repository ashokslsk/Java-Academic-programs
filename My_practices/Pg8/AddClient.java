import java.io.*;
import java.rmi.*;
public class AddClient
{
public static void main(String arg[])
{
try
{
AddServerIntf client=(AddServerIntf)Naming.lookup("registerme");
System.out.println("First no is " + arg[0]);
int x = Integer.parseInt(arg[0]);
System.out.println("Second no is " + arg[1]);
int y = Integer.parseInt(arg[1]);
System.out.println("Sum = " + client.add(x,y));
}
catch(Exception e)
{
System.out.println(e);
}
}
}