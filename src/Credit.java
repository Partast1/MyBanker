import java.time.LocalDateTime;

public class Credit extends Card implements AgeRestriction, MonthlyLimitation{


    public Credit(int cardNumber, LocalDateTime date, int accountNumber, double balance, String name) {
        super(cardNumber, date, accountNumber, balance, name);
    }
}
