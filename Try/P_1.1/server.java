import java.rmi.*;

public class server {
    public static void main(String args[]){
        try{
            Impl impl = new Impl();
            Naming.bind("server", impl);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
