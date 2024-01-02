import java.util.Random;

public class LoopOverArray {
    public static void main(String[] args){
        int[] intArray = new int[20];
        for(int i = 0; i < 20 ; i++){
            intArray[i]= GenerateRandomInteger();
        }

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] < 10){
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
