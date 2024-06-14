import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String gotMortage = scan.nextLine();
        if (gotMortage.equals("yes")) {
            System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double oweInCredit = scan.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int workedYears = scan.nextInt();
            System.out.println("What is your name?");
            scan.nextLine();
            String name = scan.nextLine();

            if (savings >= 10000 && oweInCredit < 5000 && workedYears >= 2) {
                System.out.println("Congratulations " + name + " You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }

        } else {
            System.out.println("\nOK. Have a nice day!");
        }      
        scan.close();
    }
}
