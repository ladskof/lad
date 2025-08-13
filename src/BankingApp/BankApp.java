package Banking;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
    bankingClass bc = new bankingClass();

    System.out.println("Enter your Account No: ");
    int accountNo = sc.nextInt();

    if (accountNo != bc.setAccount()) {
        System.out.println("INVALID ACCOUNT NUMBER!");
        break;
    }

    int maxTries = 3;
    boolean success = false;

    for (int attempt = 1; attempt <= maxTries; attempt++) {
        System.out.println("Enter your Pin: ");
        int pin = sc.nextInt();

        if (bc.verifyAccount(accountNo, pin)) {
            System.out.println("LOGIN SUCCESS");
            success = true;
            break;
        } else {
            System.out.println("INVALID PIN! Attempt " + attempt + " of " + maxTries);
        }
    }

    if (!success) {
        System.out.println("Too many failed PIN attempts. Access denied.");
    }

    break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}
