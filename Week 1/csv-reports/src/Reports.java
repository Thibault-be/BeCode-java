

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Reports{

    public static void main(String[] args){

        ArrayList<CsvData> rows = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("/home/tbo/repos/BeCode-java/Week 1/assets/week-1/credit-card.csv"))){
            int count = 0;
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                if (count == 0){
                    count++;
                    continue;
                }
                String[] columnData = toColumns(row);

                String reference = columnData[0].trim();
                String period = columnData[1].trim();
                System.out.println(columnData[2].trim());

                double value;
                if(!columnData[2].trim().isEmpty()){
                    value = Double.parseDouble(columnData[2].trim());
                }else{
                    value = 0.0;
                }

                String status = columnData[3].trim();
                String currency = columnData[4];
                int magnitude = Integer.parseInt(columnData[5].trim());
                String group = columnData[6].trim();
                String type = columnData[7].trim();
                String industry = columnData[8].trim();

                CsvData newRow = new CsvData(
                        reference,
                        period,
                        value,
                        status,
                        currency,
                        magnitude,
                        group,
                        type,
                        industry
                );
            }

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String[] toColumns(String row){
        return row.split(",");

    }

}