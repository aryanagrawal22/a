import java.rmi.*;

public class AddServer {
    public static void main(String args[]){
        try{
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.bind("AddServer", addServerImpl);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
