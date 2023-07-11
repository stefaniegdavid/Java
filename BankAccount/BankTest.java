public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        account1.depositMoney(500.00);
        System.out.println("Checkings Account Balance: $" + account1.getcheckingBalance());
        account1.depositMoney2(500.00);
        System.out.println("Savings Account Balance: $" + account1.getsavingsBalance());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.withdrawMoney(100.00);
        System.out.println("New Checkings Account Balance After Withdrawal: $" + account1.getcheckingBalance());


        // Static Test (print the number of bank accounts and the totalMoney)

        System.out.println("Both accounts together have a total of: $" + BankAccount.getTotalBalance());


    }
}