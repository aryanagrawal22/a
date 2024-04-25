import java.rmi.*;
import java.time.LocalTime;

public interface Intf extends Remote {
    public LocalTime time() throws RemoteException;
    public void adjust(LocalTime time) throws RemoteException;
}
