import java.time.LocalDateTime;

public class Mastercard extends Credit {
    public Mastercard(int cardNumber, LocalDateTime date, int accountNumber, double balance, String name) {
        super(cardNumber, date, accountNumber, balance, name);
    }
}
