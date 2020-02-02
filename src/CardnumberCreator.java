import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardnumberCreator {
    Prefix prefix;
    int accountnumberLengthothers = 16;
    int accountnumberLengthMaestro = 19;
    Random random = new Random();
    int numCardtype;

    public void Create(Card card){
        if (card instanceof Mastercard){
            numCardtype = prefix.mastercards[random.nextInt(0 - prefix.mastercards.length)];
            for (int i = 0; i < accountnumberLengthothers - numCardtype; i++){

            }

        }
        if (card instanceof VisaElectro){

        }


    }
    private void RandomizedAccountnumber(int number){

        var num =number;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numbers.add(9);
        }
        String tal = "0";
        for (int i = 0; i < number; i++) {

        }
        int number = rnd.nextInt(99999999);
        String text = String.format("%06d", number);
        int finalNumber = Integer.parseInt(text);
    }
}
