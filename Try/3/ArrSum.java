import java.util.*;
import mpi.*;

public class ArrSum {
    public static void main(String args[]) throws Exception{
        MPI.Init(args);
        
        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        
        int unitsize = 5;
        int root = 0;
        
        int send_buffer[] = null;
        send_buffer = new int [unitsize * size];
        int recieve_buffer[] = new int[unitsize];
        int new_recieve_buffer[] = new int[size];
        
        // Set
        if(rank==root){
            int total_elements = unitsize * size;
            System.out.println("Enter "+ total_elements+" elements: ");
            for(int i = 0; i<total_elements; i++){
                System.out.println("Element "+i+"\t = "+i);
                send_buffer[i] = i;
            }
        }
        
        // Scatter
        MPI.COMM_WORLD.Scatter(
            send_buffer, 0, unitsize, MPI.INT,
            recieve_buffer, 0, unitsize, MPI.INT,
            root
        );
        
        // Process Calculate
        for(int i=1; i<unitsize; i++){
            recieve_buffer[0]+=recieve_buffer[i];
        }
        
        System.out.println("Process "+rank+" Sum: "+recieve_buffer[0]);
        
        // Gather
        MPI.COMM_WORLD.Gather(
            recieve_buffer, 0, 1, MPI.INT,
            new_recieve_buffer, 0, 1, MPI.INT,
            root
        );
        
        if(rank==root){
            int total_sum = 0;
            for(int i=0; i<size; i++){
                total_sum += new_recieve_buffer[i];
            }
            System.out.println("Final Sum: "+total_sum);
        }
        
        MPI.Finalize();
    }
}
