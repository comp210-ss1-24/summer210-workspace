package ls03;

/** Defines a triangle with three points. */
public class Triangle {

    // Fields

    /** First point of the triangle. */
    private Point a;
    /** Second point of the triangle. */
    private Point b;
    /** Third point of the triangle. */
    private Point c;

    // Constructor

    /**
     * Constructs a triange object with the coordinates of each point.
     * @param ax x-coordinate of point A.
     * @param ay y-coordinate of point A.
     * @param bx x-coordinate of point B.
     * @param by y-coordinate of point B.
     * @param cx x-coordinate of point C.
     * @param cy y-coordinate of point C.
     */
    public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
        this.c = new Point(cx, cy);
    }

    // Other, alternative constructor (not the best option):
//    public Triangle(Point a, Point b, Point c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    // Methods

    /**
     * Finds the perimeter of the triangle.
     * @return Returns the sum of all three triangle side lengths.
     */
    public double findPerimeter() {

        double lineABLength = this.a.distanceTo(this.b);
        double lineACLength = this.a.distanceTo(this.c);
        double lineBCLength = this.b.distanceTo(this.c);

        double perimeter = lineABLength + lineACLength + lineBCLength;

        return perimeter;
    }
}
