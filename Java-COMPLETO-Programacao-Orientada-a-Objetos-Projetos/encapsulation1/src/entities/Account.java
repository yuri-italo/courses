package entities;

public class Account {
    private int accountNumber;
    private String holder;
    private double balance;

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }


    public double toDeposit(double deposit) {
        this.balance += deposit;
        return balance;
    }

    public double toWithdraw(double withdraw) {
        this.balance -= (withdraw + 5);
        return balance;
    }

    @Override
    public String toString() {
        return "Account " +
                this.accountNumber +
                ", Holder: " +
                this.holder +
                ", Balance: $ " +
                String.format("%.2f", this.balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
}
