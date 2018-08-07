package ee.sda;

public class Account {

    private double balance;
    private long accountNumber;
    private String currency;

    public Account(String currency) {
        this.balance = 0;
        this.accountNumber = 10000000 + (long) (Math.random() * 100000000L);
        this.currency = currency;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getNumber() {
        return accountNumber;
    }

    public void setNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void addMoney(double amountOfMoney) {
        this.balance += amountOfMoney;
    }

    public void substractMoney(double amountOfMoney) {
        this.balance -= amountOfMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                '}';
    }


}
