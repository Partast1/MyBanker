import java.time.LocalDateTime;

public class Debit extends Card{
    public Debit( LocalDateTime date, int accountNumber, double balance, String name) {
        super( date, accountNumber, balance, name);
    }
}
