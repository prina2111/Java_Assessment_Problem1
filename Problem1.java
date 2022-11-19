import java.util.*;

public class Problem1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the x point: ");
	    int x = sc.nextInt();
	    System.out.print("Enter the y point: ");
	    int y = sc.nextInt();
	    int ans = 0;
	    
	    while(true){
	        if(x == y){
	            System.out.println(x);
	            return;
	        } 
	        
	        x = (x+2)%12;
	        y = (y+1)%12;

	    }
	}
}
