import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class FastCollinearPoints {
    // the length of the defensive copy
    private int N;
    private HashMap<Double, ArrayList<Point>> sg;
    //The arraylist to store point sequence
    private ArrayList<LineSegment> sa;
    //the defensive copy
    private Point[] copy;

    public FastCollinearPoints(Point [] points) {       //makes a defensive copy of the array of points
        sg = new HashMap<Double, ArrayList<Point>>();
        sa = new ArrayList<PointSequence>();
        copy = new Point[points.length];
        N = copy.length;

        for(int i = 0; i <= N - 1; i++){
            copy[i] = points[i];
        }
    }

    private void addSegments(Point p, int minLength) {

        ArrayList<PointSequence> sg = new ArrayList<PointSequence>();
        for(int i = 0; i < N - 1; i++) {
            Arrays.sort(copy, p.SLOPE_ORDER);
            int start = i;
            if(p.slopeTo(copy[i]) == p.slopeTo(copy[i + 1])){
                while (i != N - 1 && p.slopeTo(copy[i]) == p.slopeTo(copy[i + 1])) i++;

                i++;
                int d = 0;
                for (int j = start + 1; j < i; j++){
                    copy[d] = copy[j];
                    d++;
                }
                copy[i - start] = p;

                      }

            else i++;
        }

       

    }

    private void collinear(int minLength){
        for(int i = 0; i < copy.length; i++) addSegments(copy[i], minLength);
    }

    public int numberOfPoints() {                        //returns the number of total points in the array
        return N;
    }

    public int numberOfSegments(int minLength) {          //returns the number of segments of length minLength or more

        if(copy.length == 0)
            collinear(minLength);
        return copy.length;
    }

    public Iterable<PointSequence> segments(int minLength) {
        if(sa.isEmpty())
            collinear(minLength);
        return sa;
    }

    public static void main(String[] args) {            //draws all maximal length segments of length 4 or more
       
    }
}
