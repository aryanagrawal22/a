import java.rmi.*;

public interface Intf extends Remote{
    double addNumbers(double n1, double n2) throws RemoteException;
}
