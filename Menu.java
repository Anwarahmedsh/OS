import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Scheduler scheduler = new Scheduler();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter process' information");
            System.out.println("2. Report detailed information about each process and different scheduling criteria");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice: ");
            choice = console.nextInt();

            switch (choice) {
                case 1:
                    ProcessInformation(console, scheduler);
                    break;
                case 2:
                    scheduler.scheduleProcesses();
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please renter a valid choice.");
                    break;
            }
        } while (choice != 3);
        
        
        public static void ProcessInformation(Scanner console, Scheduler scheduler) {
    System.out.print("Enter number of processes: ");
    int numProcesses = console.nextInt();

    for (int i = 0; i < numProcesses; i++) {
        System.out.println("Enter information for Process " + (i + 1) + ":"); // to make it appear as the first process
        System.out.print("Priority (1 or 2): ");
        int priority;
        while (true) {
            priority = console.nextInt();
            if (priority == 1 || priority == 2) {
                break; // Valid input so we exit the loop
            } else {
                System.out.println("Invalid priority. Please enter 1 or 2.");
                System.out.print("Priority (1 or 2): ");
            }
        }
        System.out.print("Arrival Time: ");
        int arrivalTime = console.nextInt();
        System.out.print("CPU Burst Time: ");
        int cpuBurstTime = console.nextInt();

        PCB process = new PCB(priority, arrivalTime, cpuBurstTime);
        scheduler.addProcess(process);
       }
    }

  }
