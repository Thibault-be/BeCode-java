import java.nio.file.Path;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CountingWords{

    public static void main(String[] args){

        Path path = Paths.get("/home/tbo/repos/BeCode-java/Week 1/assets/week-1/text.txt");

        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String[]> countList = new ArrayList<>();

        String[] appearsMost = new String[]{};
        int highestCount = 0;
        int lineCount = 0;

        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNextLine()){
                lineCount++;
                String line = scanner.nextLine();

                //break up each line into parts
                String[] parts = line.split(" ");

                //go over each piece of parts
                for (String piece : parts){

                    if (!wordsList.contains(piece)){
                        wordsList.add(piece);

                        String[] firstOccurrence = {piece, "1"};
                        countList.add(firstOccurrence);
                        continue;
                    }

                    for (int i = 0; i < countList.size(); i++){
                        if (countList.get(i)[0].equals(piece)){
                            int currentCount = Integer.parseInt(countList.get(i)[1]);
                            currentCount++;
                            countList.get(i)[1] = String.valueOf(currentCount);
                        }
                    }
                }

                for (String[] item : countList){
                    int count = Integer.parseInt(item[1]);

                    if (count > highestCount){
                        highestCount = count;
                        appearsMost = item;
                    }

                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("The word that appears the most is " + appearsMost[0] + " and is printed " + appearsMost[1] + " times." );

        for (String[] item : countList){
            for (String piece : item){
                System.out.print(piece);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println(lineCount);
    }
}