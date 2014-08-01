import java.io.*;
import java.rmi.*;
public interface AddServerIntf extends Remote
{
public int add(int x, int y) throws RemoteException;
}