public class Receipt {
    public static void main(String[] args) {

        String[] purhasedApples = {"Gala", "Granny Smith", "Macintosh"};
        double[] applePrice = {1.99, 1.49, 1.29};


        System.out.println("Here's your receipt:\n");
        
        // See instructions on Learn the Part (Workbook 6.8)
        for (int i = 0; i < purhasedApples.length; i++) {
            System.out.println("\t" + purhasedApples[i] + ": $" + applePrice[i]);
        }
    }
}
