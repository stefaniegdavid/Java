public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getcheckingBalance() {
        return this.checkingBalance;
    }

    public double getsavingsBalance(){
        return this.savingsBalance;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    public void depositMoney(double amount) {
        if (amount > 0) {
            checkingBalance += amount;
            totalMoney += amount;
        }
    }


    public void depositMoney2 (double amount) {
        if (amount > 0) {
            savingsBalance += amount;
            totalMoney += amount;
        }
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawMoney (double amount) {
        if (amount > 0) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
            }
        }
    }


    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public static double getTotalBalance() {
        return totalMoney;
    }
}