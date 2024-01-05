import java.util.Random;

public class GeneralData {


    public static final String[] firstNames = {
            "Thibault", "Matthieu", "Julie", "Jill", "Elie", "Beatrijs", "Bram", "Ines",
            "Roland", "Thor", "Jana", "Alessandro", "Funda", "Eduarda", "Kelsey", "Luis",
            "Jonas", "Josué", "Gust", "Mohammed", "Alex", "Alec", "Pieter", "Sieglinde", "Selin",
            "Louis", "Michiel", "Lisa", "Marlies", "Hans"
    };

    public static final String[] lastNames = {
            "Smith", "Johnson", "Williams", "Brown", "Jones",
            "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson",
            "Thomas", "Taylor", "Moore", "Jackson", "Martin",
            "Lee", "Perez", "Thompson", "White", "Harris",
            "Clark", "Lewis", "Robinson", "Walker", "Hall",
            "Young", "King", "Wright", "Scott", "Green",
            "Adams", "Baker", "Nelson", "Hill", "Ramirez"
    };

    public static final String[] reason = { "appointment", "visit"};

    public static final String[] department = {"Cardiology", "Radiology", "Pediatrics", "Geriatrics", "Pulmonology"};


    public static String giveFirstName(){
        Random random = new Random();
        int randomInt = random.nextInt(30);
        return firstNames[randomInt];
    }

    public static String giveLastName(){
        Random random = new Random();
        int randomInt = random.nextInt(40);
        return lastNames[randomInt];
    }

    public static String getReason(){
        Random rand = new Random();
        int randInt = rand.nextInt(2);
        return reason[randInt];
    }

    public static String getDepartment(String reason){

        if (reason.equals("visit")) return "";

        Random rand = new Random();
        int randInt = rand.nextInt(5);
        return department[randInt];
    }



}
