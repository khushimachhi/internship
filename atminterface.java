
import java.util.Scanner;

class BankAccount{
    private int balance;
    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }

    public int balance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposit of" + amount + "Rs was successful");
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdrawal(int amount){
        if(amount > 0 && amount <= balance){
            System.out.println("Withdrawal successful of " + amount + " Rs");
            amount-=balance;
        }else{
            System.out.println("Invalid amount!! Insufficient balance entered");
        }
    }
    }

class ATM{
    private BankAccount account;
    public ATM (BankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("Welcome to the ATM");
        System.err.println("Select Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            display();
            System.out.println("Pick an option");
            option = sc.nextInt();
            switch(option){
                case 1:
                System.out.println("Enter amount to deposit");
                int depositAmount = sc.nextInt();
                account.deposit(depositAmount);
                break;
                case 2:
                System.out.println("Enter amount to withdraw");
                int withdrawalAmount = sc.nextInt();
                account.withdrawal(withdrawalAmount);
                break;
                case 3:
                System.out.println("Current Balance" + account.balance());
                break;
                case 4:
                System.out.println("Thank you for using the ATM");
                break;
                default:
                System.out.println("Invalid option. Please enter a valid option");
            }
         }while(option != 4);
         sc.close();
     }

    
}
public class atminterface{
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(30000);
        ATM atm = new ATM(userAccount);
        atm.run();
}   
}