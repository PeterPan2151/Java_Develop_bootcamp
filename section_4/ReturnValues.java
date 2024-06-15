public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.0,2.1);
        printArea(2.0, 2.1, area1);
        String language1 = explainArea("Spanish");
        System.out.println(language1);
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        } else if (length == width) {
            System.out.println("This is not a rectangle.");
            System.exit(0);
        }
        double area = length * width;
        return area;
        
        
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
    
            case "French":
                return "La surface est egale a la longueur * la largeur";
           
            case "Spanish":
                return "area es igual a largo * ancho";

            default:
                return "I don't know that language.";
        } 
    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of "+ width + " has an area of " + area);
    }
}

