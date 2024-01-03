import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.regex.*;

public class CountingLetters{

    public static void main (String[] args){

        Path path = Paths.get("/home/tbo/repos/BeCode-java/Week 1/assets/week-1/text.txt");
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> alphabet = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]", Pattern.CASE_INSENSITIVE);
        int highestCount = 0;
        String mostFound = "";

        try (Scanner scanner = new Scanner(path)){

            while (scanner.hasNextLine()){
                //read every line
                String line = scanner.nextLine();
                if (line == null) continue;

                // split line into words
                String[] words = line.split(" ");

                //go over each word and count the letter
                for (String word : words){
                    String[] letters = word.split("");

                    for (String character : letters){
                        Matcher matcher = pattern.matcher(character);
                        boolean patternFound = matcher.find();
                        if (!patternFound) continue;
                        if (!hm.containsKey(character)){
                            hm.put(character, 1);
                            continue;
                        }
                        int count = (int) hm.get(character);
                        count++;
                        hm.put(character, count);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (String key : hm.keySet()){
            System.out.println(key + " was in the file " + hm.get(key) + " times");
            if (hm.get(key) > highestCount){
                highestCount = hm.get(key);
                mostFound = key;
            }
        }
        System.out.println("\n" + mostFound + " was found the most with " + highestCount + " entries.");
    }
}