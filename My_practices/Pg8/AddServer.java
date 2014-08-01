import java.io.*;
import java.rmi.*;
public class AddServer
{
public static void main(String arg[])
{
try
{
AddServerImpl server=new AddServerImpl();
Naming.rebind("registerme",server);
System.out.println("server is running.......");
}
catch(Exception e)
{
System.out.println(e);
}
}
}