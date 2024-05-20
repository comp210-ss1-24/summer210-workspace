package ls03;

/** Class that contains the main method for the in-class example. */
public class PerimeterExample {

    /** Runs the example for the class. */
    public static void main(String[] args) {

        // (x, y) points A, B, C
        Triangle t = new Triangle(0.0, 0.0, 2.0, 3.0, 4.0, 0.0);

        System.out.println("Perimeter: " + t.findPerimeter());

        // To find a square root:
        // Math.sqrt(double);

        // To find a power (x^p)
        // Math.pow(x, p);

        // Find: pointBX ^ 2
        // Math.pow(pointBX, 2);

        // static (class), non-static (instance)

        // Math math = new Math();
        // math.sqrt();
        //
        // String a = new String("example");
        // a.length()
    }
}