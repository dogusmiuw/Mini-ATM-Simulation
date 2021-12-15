import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void addUser(User u){
        users.add(u);
    }

    public void deleteUser(User u){
        users.remove(u);
    }

    public User getUser(long id){
        for(User e : users){
            if(e.getId() == id)
                return e;
        }
        return null;
    }

    public int findUser(long id){
        for(User e : users){
            if(e.getId() == id)
                return users.indexOf(e);
        }
        return -1;
    }

    public void changeName(User u){
        System.out.print("Enter new name: ");
        u.setName(scan.nextLine());
    }

    public void changeSurname(User u){
        System.out.print("Enter new surname: ");
        u.setSurname(scan.nextLine());
    }

    public void changePIN(User u){
        System.out.print("Enter old PIN: ");
        if(!scan.nextLine().equals(u.getPin()))
            System.out.println("PIN is incorrect.");
        else{
            System.out.print("Enter new PIN: ");
            String pin = scan.nextLine();
            System.out.print("Enter new PIN again: ");
            String pin2 = scan.nextLine();
            
            if(pin.equals(pin2))
                u.setPin(pin);
            else
                System.out.println("PINs do not match.");
        }
    }

    public void deposit(User u, double amount){
        if(amount > 0)
            u.setBalance(u.getBalance()+amount);
        else
            System.out.println("Invalid amount.");
    }

    public void withdrawal(User u, double amount){
        if(amount > 0 && amount <= u.getBalance())
            u.setBalance(u.getBalance()-amount);
        else
            System.out.println("Invalid amount.");
    }
}
