import java.rmi.*;

public class client {
    public static void main(String args[]){
        try{
            String addServer = "rmi://"+args[0]+"/server";
            Intf intf = (Intf) Naming.lookup(addServer);
            double n1 = Double.parseDouble(args[1]);
            double n2 = Double.parseDouble(args[2]);
            System.out.println(intf.addNumbers(n1, n2));
        }catch( Exception e){
            System.out.println(e);
        }
    }
}
