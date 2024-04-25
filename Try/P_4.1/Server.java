import java.rmi.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Server {
    public static void main(String args[]){
        try{
            String c1 = "rmi://127.0.0.1/"+args[0];
            String c2 = "rmi://127.0.0.1/"+args[1];
            String c3 = "rmi://127.0.0.1/"+args[2];
            
            LocalTime servertime = LocalTime.parse("03:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
            
            Intf cl1 = (Intf) Naming.lookup(c1);
            Intf cl2 = (Intf) Naming.lookup(c2);
            Intf cl3 = (Intf) Naming.lookup(c3);
            
            long servernano = servertime.toNanoOfDay();
            long c1nano = cl1.time().toNanoOfDay()-servernano;
            long c2nano = cl2.time().toNanoOfDay()-servernano;
            long c3nano = cl3.time().toNanoOfDay()-servernano;
            
            long avg = (c1nano+c2nano+c3nano)/4;
            
            servertime = servertime.plusNanos(avg);
            cl1.adjust(servertime);
            cl2.adjust(servertime);
            cl3.adjust(servertime);
            
            System.out.println(servertime);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
