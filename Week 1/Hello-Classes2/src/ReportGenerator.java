import java.util.ArrayList;

public class ReportGenerator {

    private CsvFile file;

    public ReportGenerator(CsvFile file){
        this.file = file;
    }

    public double getTotalValueFromYear(int year){
        double total = 0;

        ArrayList<CsvData> yearlyData = this.file.getDataFromYear(year);

        for (CsvData dataRow : yearlyData ){
            if (dataRow.getYear() == year){
                total += dataRow.getValue();
            }
        }

        return total;

    }
}
