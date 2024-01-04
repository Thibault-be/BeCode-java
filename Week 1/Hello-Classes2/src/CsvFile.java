import java.util.ArrayList;

public class CsvFile {

    private ArrayList<CsvData> csvFile;

    public CsvFile(ArrayList<CsvData> csvFile){
        this.csvFile = csvFile;
    }


    public ArrayList<CsvData> getDataFromYear(int year){
        ArrayList<CsvData> yearlyData = new ArrayList<>();

        for (CsvData dataRow : this.csvFile ){
            if (dataRow.getYear() == year){
                yearlyData.add(dataRow);
            }
        }
        return yearlyData;
    }



}
