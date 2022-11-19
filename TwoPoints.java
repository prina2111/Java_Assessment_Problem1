import java.util.*;
public class TwoPoints {

public static void main(String[] args) {
	System.out.println("The point at which x and y meet is: " + computePointOfInterception(2, 4));
	System.out.println("The point at which x and y meet is: " + computePointOfInterception(11, 7));
}

public static int computePointOfInterception(int x, int y) {

	if( x < 1 || y < 1 || x > 12 || y > 12)
		return -1;
	
	while(true){
	        if(x == y){
	            return x;
	        } 
	        
	        x = ( x == 11 || x == 12 ) ? ( x+2 ) % 12 : x + 2;
	        y = y == 12 ? ( y+1 ) % 12 : y + 1;

	    }

}
}
