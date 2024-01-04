package src;

import javax.sound.sampled.Line;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
Write a program that can read in a comma separated value file (a csv file).
Make a data model (a class) to hold the lines and print out only one particular piece of information.
So we are expecting getter and setter methods.
 */

public class Main{

    public static void main(String[] args){

        ArrayList<CsvLine> data = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("/home/tbo/repos/BeCode-java/Week 1/assets/week-1/names.csv"))){
            int count = 0;
            while(scanner.hasNextLine()){
                if (count == 0){
                    String line = scanner.nextLine();
                    count++;
                    continue;
                }
                String line = scanner.nextLine();
                String[] parts = split(line);

                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());

                CsvLine entry = new CsvLine(firstName, lastName, age);
                data.add(entry);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        data.get(0).setFirstName("Tobias");
        int counter = 0;
        for (CsvLine line : data){
            counter++;
            System.out.println("This is entry " + counter);
            System.out.println("first name: " + line.getFirstName());
            System.out.println("last name: " + line.getLastName());
            System.out.println("age: " + line.getAge());
            System.out.println();
        }
    }

    public static String[] split(String line){
        return line.split(",");
    }
}