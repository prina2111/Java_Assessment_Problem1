import java.util.*;
public class TwoPoints {

public static void main(String[] args) {
	int x = 11;
	int y = 7;
	System.out.println("The point at which node " + x + " and node " + y + " meet is point " + computePointOfInterception(x, y));
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
