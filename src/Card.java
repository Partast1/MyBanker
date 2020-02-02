import java.time.LocalDateTime;

public abstract class Card {
    private int cardNumber;
    private LocalDateTime date;
    private int accountNumber;
    private double balance;
    private String name;

    public Card( LocalDateTime date, int accountNumber, double balance, String name) {

        this.date = date;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

}
