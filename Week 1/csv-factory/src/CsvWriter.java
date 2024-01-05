import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter{

    private BufferedWriter writer;

    public CsvWriter(String fileName) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(String value) throws IOException{
        this.writer.write(value);
    }

    public void close() throws IOException {
        this.writer.close();
    }

}