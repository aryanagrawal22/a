import java.util.*;

public class Bully {
    int max_process;
    int coordinate;
    boolean processes[];
    
    Bully(int max) {
        System.out.println("Creating "+max+ " process");
        this.coordinate = max;
        this.max_process = max;
        processes = new boolean[max_process];
        
        for(int i=0; i<max; i++){
            processes[i] = true;
        }
        
        System.out.println("Coordinator is "+this.coordinate);
    }
    
    public void display(){
        for(int i=0; i<this.max_process; i++){
            if(processes[i]) {
                System.out.println("Process "+i+": ACTIVE");
            }else{
                System.out.println("Process "+i+": INACTIVE");
            }
        }
    }
    
    public void up(int process){
        processes[process] = true;
    }
    
    public void down(int process){
        processes[process] = false;
    }
    
    public void run(int process_id){
        coordinate = process_id;
        boolean keepGoing = true;

        for(int i = process_id; i < max_process && keepGoing; i++) {
            System.out.println("Election message sent from process " + process_id + " to process " + (i+1));

            if(processes[i]) {
                keepGoing = false;
                run(i + 1);
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of process: ");
        int max_process = sc.nextInt();
        Bully obj = new Bully(max_process);
        
        while(true) {
            System.out.println("1. Display processes");
            System.out.println("2. Up a process");
            System.out.println("3. Down a process");
            System.out.println("4. Run election algorithm");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    obj.display();
                    break;
                case 2:
                    System.out.println("Enter the process to active: ");
                    int up_id = sc.nextInt();
                    obj.up(up_id);
                    break;
                case 3:
                    System.out.println("Enter the process to inactive: ");
                    int down_id = sc.nextInt();
                    obj.down(down_id);
                    break;
                case 4:
                    System.out.print("Enter the process number which will perform election:- ");
                    int pid = sc.nextInt();
                    obj.run(pid);
                    System.out.print("Coordinate is:- "+obj.coordinate+"\n");
                    break;
                default:
                    break;
            }
        }
    }
}
