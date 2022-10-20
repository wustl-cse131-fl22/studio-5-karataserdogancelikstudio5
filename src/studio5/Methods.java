package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		
		distance = Math.sqrt(((x2-x1)*(x2-x1) + ((y2-y1)*(y2-y1))));
	
		return distance;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(x, y, radius * 0.75);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(x, y, radius * 0.5);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(x, y, radius * 0.25);

		// TODO: Draw the remaining rings of the bull's eye
		// Blue ring with 3.0/4.0 the radius
		// suggested rgb values: 0, 109, 219

		

		// Red ring with 1.0/2.0 the radius
		// suggested rgb values: 146, 0, 0

		

		// Yellow ring with 1.0/4.0 the radius
		// suggested rgb values: 255, 255, 109

		
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		// TODO: Finish this method
		int index=0;
//		int counter=0;
		String firstpart = "";
		String lastpart = "";
		
		
		for (int i=0; i<source.length();i++) {
			if (i==0) {
				index = source.indexOf(target);
				firstpart = source.substring(0,index);
				lastpart = source.substring(index+1);
				
			}
			else {
				index = lastpart.indexOf(target);
				firstpart = lastpart.substring(0,index);
				lastpart = lastpart.substring(index+1);
				
			}
			//firstpart = source.substring(0,index);
			//lastpart = source.substring(index+1);
			
			result = firstpart + replacement + lastpart;
			
		}
		
		
		
		/*while (source.indexOf(target) <=source.length()) {
			index = source.indexOf(target);
			String firstpart = source.substring(0,index);
			String lastpart = source.substring(index+1);
			
			result = firstpart + replacement + lastpart;
			counter++;
			
		}*/
		
		return result;
	}


	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		// FIXME: Compute the sum of the values in an array
		
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = null; // FIXME: Create an array of the appropriate size
		// TODO: Finish this method

		

		return values;
	}

	// TODO: Create an arrayMean method which accepts an int array of values parameter.
	// TODO: Create a JavaDoc comment for the arrayMean method.

	
}
