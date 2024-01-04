import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Reports {

    public static void main(String[] args) {

        // Read the CSV file and create an instance of CSVFile
        ArrayList<CsvData> rows = new ArrayList<>();

        //get date to append to fileName that will be generated
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println(strDate);

        try (Scanner scanner = new Scanner(Paths.get("/home/tbo/repos/BeCode-java/Week 1/assets/week-1/credit-card.csv"))) {
            int count = 0;
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (count == 0) {
                    count++;
                    continue;
                }
                String[] columnData = toColumns(row);

                String reference = columnData[0].trim();
                String period = columnData[1].trim();

                double value;
                if (!columnData[2].trim().isEmpty()) {
                    value = Double.parseDouble(columnData[2].trim());
                } else {
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
                rows.add(newRow);
            }
            CsvFile csvFile = new CsvFile(rows);

            ReportGenerator reportGenerator = new ReportGenerator(csvFile);

            double total2022 = (reportGenerator.getTotalValueFromYear(2022) / 1000000000);
            String strTotal2022 = total2022+"";
            System.out.printf("%.1f bln dollars worth", total2022);

            String reportName = "value-report-" + strDate;
            CsvWriter writer =  new CsvWriter(reportName);
            writer.write(strTotal2022);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static String[] toColumns(String row) {
        return row.split(",");
    }

}


