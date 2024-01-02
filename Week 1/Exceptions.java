import java.util.Random;

public class Exceptions {

    public static void main (String[] args){

        Integer[] intArray = new Integer[50];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = generateInteger();
        }

        for (int i = 0; i < intArray.length; i++){

            try {
                if (i == 0) {
                    System.out.println(intArray[0] / intArray[0]);
                    continue;
                }
                int denominator = intArray[i];
                int divisor = intArray[i-1];
                System.out.println(denominator / divisor);
            } catch (Exception e){
                System.out.println("Cannot divide by zero");
            }
        }
    }

    public static Integer generateInteger(){
        Random rand = new Random();
        int upperBound = 25;
        Integer randInt = rand.nextInt(upperBound);
        System.out.println("printing " + randInt);
        return randInt;
    }

}