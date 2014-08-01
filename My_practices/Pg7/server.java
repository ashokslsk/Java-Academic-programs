import java.net.*;
import java.io.*;
import java.util.*;
public class server
{
public static void main(String args[])
{
ServerSocket server=null;
try
{
server=new ServerSocket(Integer.parseInt(args[0]));
}catch(Exception e){}
while(true)
{
Socket client=null;
PrintStream output=null;
DataInputStream input=null;
try
{
client=server.accept();
} catch(Exception e){ System.out.println(e);}
try
{
output=new PrintStream(client.getOutputStream());
input=new DataInputStream(client.getInputStream());
} catch(Exception e){ System.out.println(e);}
// send the command prompt to the client
output.println("ENTER THE FILE NAME >");
try
{
// get the file name from the client
String filename=input.readLine();
System.out.println("Client requested file: " + filename);
try
{
File f=new File(filename);
BufferedReader br=new BufferedReader(new FileReader(f));
String data;
while((data=br.readLine()) != null)
{
output.println(data);
}
}
catch(FileNotFoundException e)
{ output.println("FILE NOT FOUND"); }
client.close();
}catch(Exception e){
System.out.println(e);
}
}
}
}