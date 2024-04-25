import java.rmi.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C {
    public static void main(String args[]){
        try{
            Impl intf = new Impl(LocalTime.parse(args[0], DateTimeFormatter.ofPattern("HH:mm:ss")));
            Naming.bind(args[1], intf);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
