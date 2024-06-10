public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes you did, congrats!");
        } else {
            System.out.println("No, you did not.");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if (sales > costs) {
            System.out.println("Yes we did.");
        } else {
            System.out.println("No we didn't.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if (temperature < targetTemperature) {
            System.out.println("Yes, it is colder");
        } else {
            System.out.println("No, it isn't");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if (currentSpeed < speedLimit) {
            System.out.println("Yes, keep it that way.");
        } else {
            System.out.println("No, slow down.");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if (age >= retirementAge) {
            System.out.println("Yes, enjoy your retirement.");
        } else {
            System.out.println("No, you still have some years left.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if (myGrade == bestGrade) {
            System.out.println("You did, congrats.");
        } else {
            System.out.println("No you didn't.");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if (word.equals(secondWord)) {
            System.out.println("They are the same words");
        } else {
            System.out.println("No, they are different.");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if (!thirdWord.equals(fourthWord)) {
            System.out.println("Yes, they are different words.");
        } else { 
            System.out.println("No, they are the same word.");
        }
    }
}
