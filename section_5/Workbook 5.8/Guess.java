import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myNumber = (int) ((Math.random() * 4) + 1);
       System.out.println(myNumber);

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int userNumber = scan.nextInt();
       
        
       
       
       
       //See Learn the Part for detailed instructions.
       while (userNumber != myNumber) {
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        userNumber = scan.nextInt();
       }

       System.out.println("You got it!");
        
        scan.close();
    }

}
