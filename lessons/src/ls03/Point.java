package ls03;

/** Represents a point (x,y) in a Cartesian coordinate plane. */
public class Point {

    // Fields

    /** The x-coordinate of the point. */
    private double x;
    /** The y-coordinate of the point. */
    private double y;

    // Constructor

    /**
     * Constructs a point object.
     * @param x The x coordinate of the point.
     * @param y The y coordinate of the point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method

    /**
     * Finds the distance from this point to another point.
     * @param otherPoint The other point to find the distance to.
     * @return Distance from point A to point B.
     */
    public double distanceTo(Point otherPoint) {
        double distance = Math.sqrt(
                Math.pow((otherPoint.getX() - this.getX()), 2) +
                        Math.pow((otherPoint.getY() - this.getY()), 2)
        );
        return distance;
    }

    // Getter methods

    /** Getter method for the x coordinate. */
    public double getX() {
        return this.x;
    }

    /** Getter method for the y coordinate. */
    public double getY() {
        return this.y;
    }
}
