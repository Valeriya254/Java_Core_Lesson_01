package Logos;

public class Application {
public static void main(String[] args) {
		
		/* a = 1;
		boolean b = true;
		byte c = 3;
		char d = 'h';
		short e = 5;
		long g = 6l;
		float k = 5.6f;
		double l = 2.3;*/
		
		
	    System.out.println("Max Integer " + Integer.MAX_VALUE);
	    System.out.println("Min Integer " + Integer.MIN_VALUE);
	    System.out.println("Max Byte" + Byte.MAX_VALUE);
	    System.out.println("Min Byte " + Byte.MIN_VALUE);
	    System.out.println("Max Short " + Short.MAX_VALUE);
	    System.out.println("Min Short " + Short.MIN_VALUE);
	    System.out.println("Max Long " + Long.MAX_VALUE);
	    System.out.println("Min Long " + Long.MIN_VALUE);
	    System.out.println("Max Float " + Float.MAX_VALUE);
	    System.out.println("Min Float " + Float.MIN_VALUE);
	    System.out.println("Max Double " + Double.MAX_VALUE);
	    System.out.println("Min Double " + Double.MIN_VALUE);

		
		/*System.out.println();
		*/
	    int [] arr = {1, 37, 4, 55, 2, 6, 10, 87, 91, 7};

	    
	    int max = arr[0];
	    for (int i = 0; i < 10; i++) {
	    	if (max < arr[i])
	    		max = arr [i];
	    }
	    
	    System.out.println(max);
	    
	    int min = arr[0];
	    for (int i = 0; i > 10; i++) {
	    	if (min > arr[i])
	    		min = arr [i];
	    }
	    
	    System.out.println(min);
	    //First commit
	   
	}
}
