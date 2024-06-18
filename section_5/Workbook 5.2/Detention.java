import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        String message = scan.nextLine();
        for (int i = 1; i < 100; i++) {
            System.out.println(message);
        }
        //I will not forget semi-colons.
        scan.close();
        
    }
}
