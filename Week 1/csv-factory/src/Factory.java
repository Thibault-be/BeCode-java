import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Factory{

        public static void main (String[] args) throws ParseException, IOException {

                String fileName = "CsvOutput.csv";
                CsvWriter writer = new CsvWriter(fileName);


                for (int i = 0; i < 250; i++){

                        if (i == 0){
                                writer.write("First name, Last name, Reason, Department, Date");
                                continue;
                        }

                        Visit visit = new Visit();
                        writer.write(visit.toString());

                }
                writer.close();
        }
}