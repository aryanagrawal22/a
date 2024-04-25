import java.rmi.*;

public class AddClient {
    public static void main(String args[]){
        try{
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerInterface addServerInterface = (AddServerInterface) Naming.lookup(addServerURL);
            System.out.println("First number iss: "+args[1]);
            double d1 = Double.parseDouble(args[1]);
            System.out.println("Second number is: "+args[2]);
            double d2 = Double.parseDouble(args[2]);
            System.out.println("The sum is: "+ addServerInterface.add(d1, d2));
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
