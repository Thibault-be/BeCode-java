import java.util.Random;
import java.util.Scanner;

public class LoopOverArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[20];
        for(int i = 0; i < 20 ; i++){
            intArray[i]= GenerateRandomInteger();
        }

        System.out.print("What is your upper limit? ");
        int upperLimitForPrinting = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] <= upperLimitForPrinting){
                System.out.println(intArray[i]);
            }
        }
    }

    public static int GenerateRandomInteger(){
        Random rand = new Random();
        int upperBound = 25;
        return rand.nextInt(upperBound);
    }
}
