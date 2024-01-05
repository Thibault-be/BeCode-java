import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

    private String randomDate;

    public RandomDate() throws ParseException {
        this.randomDate = generateRandomDate();
    }

    public String generateRandomDate() throws ParseException {

        String oneJanString = "01-01-2024";
        String thirtyoneDecString = "31-12-2024";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date oneJan = dateFormat.parse(oneJanString);
        Date thirtyoneDec = dateFormat.parse(thirtyoneDecString);

        long random = ThreadLocalRandom.current().nextLong(oneJan.getTime(), thirtyoneDec.getTime());
        Date date = new Date(random);

        String strRandomDate = dateFormat.format(date);
        return strRandomDate;
    }

}
