//import java.awt.Point;
import java.util.Arrays;
import java.util.ArrayList;

public class BruteCollinearPoints {
    private int N;
    //private int numSegments = -1;
    private PointSequence[] sg;
    // create an array list
    private ArrayList<PointSequence> sq = new ArrayList<>();

    public BruteCollinearPoints(Point [] points) {   //makes a defensive copy of the array of points
        checkDuplicate(points);
        Point[] pointscopy = Arrays.copyOf(points, points.length);
        N = pointscopy.length;
        Arrays.sort(pointscopy);
        for(int p = 0; p < N - 3; p++){
            for(int q = p + 1; q < N - 2; q++) {
                for(int r = p + 2; r < N - 1; r++) {
                    for(int s = p + 3; s < N; s++) {
                        if(pointscopy[p].slopeTo(pointscopy[q]) == (pointscopy[p].slopeTo(pointscopy[r])) &&
                        (pointscopy[p].slopeTo(pointscopy[q])) == (pointscopy[p].slopeTo(pointscopy[s]))){
                            Point[] pts = {pointscopy[p], pointscopy[q], pointscopy[r], pointscopy[s]};    
                            sq.add(new PointSequence(pts));
                        }
                    }
                }
                sg = sq.toArray(new PointSequence[sq.size()]);
            }
        }
    }
    private void checkDuplicate(Point [] points){
    for(int i = 0; i < points.length; i++) {
        for(int j = i + 1; j < points.length; j++) {
            if(points[i].compareTo(points[j]) == 0) throw new IllegalArgumentException("There is a Duplicate.");
        }
        }
    }

    public int numberOfPoints() {                    //returns the number of total points in the array
        return N;
    }

    public int numberOfSegments() {                  //returns the number of segments of length 4
        int numSegments = sq.size();
        //if(numSegments <= 0)
           // segments();
        return numSegments;
    }

    public Iterable<PointSequence> segments() {      //returns an iterable of segments of length 4
        return sq;
    }
    

    public static void main(String[] args) {         //draws all 4 point segments in file
        // rescale coordinates and turn on animation mode
//         StdDraw.setPenRadius(0.01);
//         StdDraw.setXscale(0, 32768);
//         StdDraw.setYscale(0, 32768);
//         StdDraw.show(0);
//         
// 
//         // read in the input
//         
//         String filename = args[0];
//         In in = new In(filename);
//         int N = in.readInt();
//         for (int i = 0; i < N; i++) {
//             int x = in.readInt();
//             int y = in.readInt();
//             Point p = new Point(x, y);
//             p.draw();
//         }
//         
// 
//         // display to screen all at once
//         StdDraw.show(0);
    }
}