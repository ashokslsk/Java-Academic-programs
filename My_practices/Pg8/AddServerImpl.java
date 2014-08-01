import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
public AddServerImpl() throws RemoteException{ }
public int add(int x, int y) throws RemoteException{return x+y;}
}