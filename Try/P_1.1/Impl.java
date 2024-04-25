import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Impl extends UnicastRemoteObject implements Intf{
    public Impl() throws RemoteException {}
    public double addNumbers(double n1, double n2) throws RemoteException {return n1+n2;}
}
