package day41_Inheritance.Task02;

public class AccountObjects {

    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Saban";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(10000);
        obj.showBalance();

        System.out.println(obj);

        System.out.println("==================================");

        SavingsAccount saving = new SavingsAccount();
        saving.accountHolder = "Elif";

        System.out.println(SavingsAccount.interestRate);

        System.out.println( saving );

        saving.deposit(3000);
        saving.showBalance();

        //saving.withdraw();



    }

}