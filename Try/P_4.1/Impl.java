import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalTime;

public class Impl extends UnicastRemoteObject implements Intf {
    LocalTime servertime;
    Impl(LocalTime time) throws RemoteException{
        this.servertime = time;
    }
    public LocalTime time() throws RemoteException{
        return this.servertime;
    }
    public void adjust(LocalTime time) throws RemoteException{
        this.servertime = time;
    }
}
