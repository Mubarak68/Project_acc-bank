import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            try {
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine(); 
                String myAccountNumber = "11211234";
                BankAccount myAccount = new BankAccount(accountNumber);
                if (accountNumber.equals(myAccountNumber)) {
                    myAccount.deposit(1000);
                    myAccount.withdraw(500);
                    myAccount.deposit(200);
                    myAccount.withdraw(300);
                    myAccount.displayTransactionHistory();
            
                    System.out.println("These are you last trasnsactions. Thank you!!");
                    break;
                    
                } 
                else {
                    throw new Exception("Invalid credentials");
                    
                }
            } 

            catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        scanner.close();
    }
    
    }
}