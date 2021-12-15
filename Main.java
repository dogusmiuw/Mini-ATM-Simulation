import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        UserManager um = new UserManager();

        System.out.println("Welcome!");
        startMenu(um);
    }

    static void startMenu(UserManager um){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("What do you want to do?");
            System.out.println("1. Login\n2. Register\n0. Quit");
            int s = scan.nextInt();
            if(s == 1){
                System.out.print("Enter ID: ");
                long id = scan.nextLong();
                scan.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scan.nextLine();
                
                if(um.findUser(id) != -1 && um.getUser(id).getPin().equals(pin)){
                    System.out.println("Successfully logged in.");
                    mainMenu(scan, um.getUser(id), um);
                }else
                    System.out.println("User not found.");
            }else if(s == 2){
                System.out.print("Enter ID: ");
                long id = scan.nextLong();
                scan.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scan.nextLine();
                System.out.print("Enter Name: ");
                String name = scan.nextLine();
                System.out.print("Enter Surname: ");
                String surname = scan.nextLine();
                System.out.print("Enter balance: ");
                double balance = scan.nextDouble();

                User u = new User(id, pin, name,surname,balance);
                um.addUser(u);
            }else if(s == 0){
                System.out.println("Have a good day!");
                break;
            }else{
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void mainMenu(Scanner scan, User u, UserManager um){
        System.out.println();
        while(true){
            System.out.println("1. Display Account\n2. Change Name\n"+
                "3. Deposit\n4. Withdrawal\n5. Change PIN\n0. Quit");
            int s = scan.nextInt();

            if(s == 1){
                System.out.println(u);
            }else if(s == 2){
                um.changeName(u);
                um.changeSurname(u);
            }else if(s == 3){
                System.out.print("Enter deposit amount: ");
                double amount = scan.nextDouble();
                
                um.deposit(u, amount);
            }else if(s == 4){
                System.out.print("Enter withdrawal amount: ");
                double amount = scan.nextDouble();

                um.withdrawal(u, amount);
            }else if(s == 5){
                um.changePIN(u);
            }else if(s == 0){
                break;
            }else{
                System.out.println("Invalid choice.");
            }
        }
    }
}
