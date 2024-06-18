import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String userPlay = scan.nextLine();

        if (userPlay.equals("yes")) {
            System.out.println("Great");
            System.out.println("rock - paper - scissors, shoot!");
            String usersChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(usersChoice, computerChoice);
            printresult(usersChoice, computerChoice, result);
        } else if (userPlay.equals("no")){
            System.out.println("Darn, some other time.");
        } else {
            System.out.println("INVALID OPTION");
            System.exit(0);
        }
              
        scan.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int computerChoice = (int) (Math.random() * 3);
        switch (computerChoice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
        }
        return "";
    }

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals(computerChoice)) {
            result = "It's a tie.";
        } else if (yourChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                result = "You win!";
            } else if (computerChoice.equals("paper")) {
                result = "You loose.";
            }
        } else if (yourChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                result = "You win!";
            } else if (computerChoice.equals("scissors")) {
                result = "You loose.";
            }
        } else if (yourChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                result = "You win!";
            } else if (computerChoice.equals("rock")) {
                result = "You loose.";
            }
        } else {
            System.out.println("INVALID OPTION");
            System.exit(0);
        }

        return result;
    }

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */
    public static void printresult(String yourChoice, String compyerChoice, String result) {
        System.out.println("You choose: " + yourChoice);
        System.out.println("The computer choose: " + compyerChoice);
        System.out.println(result);
    }

}
