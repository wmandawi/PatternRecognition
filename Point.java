
/*************************************************************************
 * Name: Wurood Mandawi
 * Login: wmandawi
 *
 *
 * Compilation:  javac Point.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/

import java.util.Comparator;

public class Point implements Comparable<Point> {

    // compare points by slope
    public final Comparator<Point> SLOPE_ORDER;       // YOUR DEFINITION HERE
    private class slopeOrder implements Comparator<Point> {
        public int compare(Point p, Point q){
            if (slopeTo(p) < slopeTo(q)) return -1;
            else if (slopeTo(p) > slopeTo(q)) return 1;
            else return 0;

        }
    }
    private final int x;                              // x coordinate
    private final int y;                              // y coordinate

    // create the point (x, y)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        SLOPE_ORDER = new slopeOrder();
    }

    // plot this point to standard drawing
    public void draw() {
        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // slope between this point and that point
    public double slopeTo(Point that) {
        //Vertical
        if (that.x == this.x) return Double.POSITIVE_INFINITY;
        //Horizontal
        else if (that.y == this.y) return +0;
        //Degenerate line segment
        else if (compareTo(that) == 0) return Double.NEGATIVE_INFINITY;
        //find slop
        else return new Double (this.y - that.y)/ new Double (this.x - that.x);
    }

    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    public int compareTo(Point that) {
        //same
        if((that.y == this.y)  && (that.x == this.x)) return 0;
        //less
        else if((that.y > this.y) || (that.y == this.y) && (that.x > this.x))return -1;
        //greater
        else return +1;

    }
    // return string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
