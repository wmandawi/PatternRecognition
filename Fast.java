import java.util.ArrayList;
import java.util.HashMap;
public class Fast {

    private HashMap<Double, ArrayList<Point>> sg;
    private ArrayList<LineSegment> ls;
    private double[] slopes;
    private double[] chicken;
    private int x=0;
    private int y;
    private int winnerslope=0;
    private int z;
    private int oldz;
    public Fast(Point [] points) {       //makes a defensive copy of the array of points
        copy[x]=points[x];
        x++;
        
        for (int j=0 ; j<=points.length ; j++){
            copy[x] = points[x];
            slopes[i]= p.slopeTo(copy[x]);
            
            for (int i=0 ; i<=points.length ; i++){
                
                if (slope[y]==slope[i]){ //how many times the slope at y occurs
                    z++;
                }
                
            }   
            if (z>oldz){ // decides the most points
                winnerslope=z;
            }
            else{
                winnerslope=oldz;
            }
            x++;
            y++; // y is increased so that you can test the next slope
            oldz=z;
            z=0;
        }
        
        //OR...
        
        for (int i=0; i<=chicken.length; i++){ //change chicken
            copy[x] = points[x];
            slopes[i]= p.slopeTo(copy[x]);
            //SORT'EM
        }
        for (int j=0; j<=chicken.length; j++){ //change chicken
            if (slope[x]==slope[j]){
                z++;
            }
            if (z>oldz){ // decides the most points
                winnerslope=z;
            }
            else{
                winnerslope=oldz;
            }
            oldz=z;
            z=0;
            x++;
        }
        System.out.println((winnerslope*2-1)+ " are the most points that occured");
    }

    public int numberOfPoints() {                       //returns the number of total points in the array
    }

    public int numberOfSegments(int minLength) {        //returns the number of segments of length minLength or more
    }

    public Iterable<PointSequence> segments(int minLength) {
    }

    public static void main(String[] args) {            //draws all maximal length segments of length 4 or more
    }
}