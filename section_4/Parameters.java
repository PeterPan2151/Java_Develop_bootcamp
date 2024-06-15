public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.0,2.1);
    }

    public static void calculateArea(double length, double width) {
        if (length == width) {
            System.out.println("This isn't a rectangle");
        } else {
            System.out.println("Area: " + (length * width));
        }
    }
}
