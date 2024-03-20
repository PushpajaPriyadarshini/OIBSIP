import java.util.Scanner;

public class OnlineReservationSystem1 {
    
    private static final String USERNAME = "Pushpaja";
    private static final String PASSWORD = "hey12";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Welcome to Online Reservation System");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            System.out.println("Login successful!\n");

           
            while (true) {
                System.out.println("Main Menu:");
                System.out.println("1. Reservation");
                System.out.println("2. Cancellation");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
               
                switch (choice) { 
                case 1:
                    makeReservation(scanner);
                    break;
                case 2:
                    cancelTicket(scanner);
                    break;
                case 3:
                    System.out.println("Thank you . Have a nice day");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    } else {
        System.out.println("Invalid username or password. Please try again.");
    }
}

private static void makeReservation(Scanner scanner) {
    
    System.out.println("Reservation Form:");
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); 
    System.out.print("Enter train number: ");
    String trainNumber = scanner.nextLine();
    System.out.print("Enter train name: ");
    String trainName = scanner.nextLine();
    System.out.print("Enter class type: ");
    String classType = scanner.nextLine();
    System.out.print("Enter date of journey (YYYY-MM-DD): ");
    String dateOfJourney = scanner.nextLine();
    System.out.print("Enter destination: ");
    String destination = scanner.nextLine();
   
    
    System.out.println("Reservation successful!, Thanyou");
}

private static void cancelTicket(Scanner scanner) {
    
    System.out.println("Cancellation Form:");
    System.out.print("Enter PNR number: ");
    String pnr = scanner.nextLine();
    System.out.print("Press 'ok' to confirm cancellation (yes/no): ");
    String confirmation = scanner.nextLine();
    if (confirmation.equalsIgnoreCase("yes") || confirmation.equalsIgnoreCase("ok")) {
       
        System.out.println("Ticket cancellation confirmed.");
    } 
    else {
        System.out.println("Cancellation aborted.");
        
    }

}}


