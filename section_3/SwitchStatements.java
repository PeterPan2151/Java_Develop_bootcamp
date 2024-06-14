public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt"); 
                break;
            case "cloudy":
                System.out.println("You should wear a sweater");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat");
                break;
            case "snowy":
                System.out.println("You should wear a jacekt");
                break;
            default:
                System.out.println("You can wear whatever you want");
                break;
        }

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:
                System.out.println("You are an admin");
                break;
            case 2:
                System.out.println("You are an editor");
                break;
            case 3:
                System.out.println("You are a user");
                break;
            default:
                System.out.println("Please contact HR");
                break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        if (temperature >= 80 && humidity >= 60) {
            System.out.println("It's too hot and humid\n");
        } else if (temperature >= 80) {
            System.out.println("It's too hot\n");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("It's too cold and humid\n");
        } else if (temperature <= 60) {
            System.out.println("It's too cold\n");
        } else {
            System.out.println("It's comfortable\n");
        }
        

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if (age >= 18 && age <= 60 && income >= 30000) {
        System.out.println("Congratulations, your are eligable for the credit card.\n");
        } else {
            System.out.println("Sorry, you are not eligable for the credit card.");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("Go.");
                break;
            case "yellow":
                System.out.println("Lower your speed.");
                break;
            case "red":
                System.out.println("Stop!");
            default:
                System.out.println("Power outage");
                break;
        }       


        // Section 2: Exam grade
        int grade = 85;
        if (grade >= 80) {
            System.out.println("You got an A!");
        } else if (grade >= 70) {
            System.out.println("You got a B!");
        } else if (grade >= 60) {
            System.out.println("You got a C.");
        } else if (grade >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed :(");
        }
        
        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("Enjoy your chrome extensions");
                break;
            case "Firefox":
                System.out.println("Best non profit browser");
                break;
            case "Safari":
                System.out.println("I see you're a proud apple user");
                break;
            default:
                System.out.println("Curious about your browser");
                break;
        }
        
        

    }
}
