import java.nio.file.Path;
import java.util.Scanner;
import java.nio.file.Paths;


public class CountingWords{

    public static void main(String[] args){

        Path path = Paths.get("/home/tbo/repos/BeCode-java/Week 1/assets/week-1/text.txt");


        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}