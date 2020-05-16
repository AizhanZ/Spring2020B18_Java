package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
    create a custom class for bank account
        attributes: accountHolder, accountNumber, balance
        actions: checkingBalance(), withdraw(amount), deposit()
     */
    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance " + balance);
    }
    public void withdraw(double amount){
        System.out.println("Withdrawing $ " + amount);
        balance -= amount;
    }
    public void deposit(double amount) {
        System.out.println("Depositing $ " + amount);
        balance += amount;
    }

        //create if negative charge $45

        public String toString ( ) {
            String result = "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAvailable Balance: " + balance;
            return result;

        }

}
