import java.util.Random;
import java.awt.Color;

/**
 * In this assignment, randomly draw 100 and 10 circles and select 2 of the most
 * distant circles and indicate the distance between their centers with a single
 * line.
 * 
 * @author Talha Guzel 041802046
 * @since 15.03.2020
 *
 */
public class Talha_Guzel {

	public static void main(String[] args) {

		Random rand = new Random();
		// canvas parameters
		int width = 500; // area size
		int height = 500;

		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, 250);
		StdDraw.setYscale(0, 250);

		int numCircles = 10;  //we can change num of circles (100)
		Circle[] circles = new Circle[numCircles];
		int counter = 0;
		/*
		 * coordinates randomly without circling the circles off the scale determined
		 * and drawn
		 * 
		 */
		while (counter < numCircles) {
			double x = rand.nextInt(250);
			double y = rand.nextInt(250);
			double radius = rand.nextInt(10) + 5;

			if (((x + radius < 250) && (y + radius < 250)) && ((x - radius > 0) && (y - radius > 0))) { // sınır

				circles[counter] = new Circle(x, y, radius);
				circles[counter].draw();
				counter++;
			}
		}
		/**
		 * max distance determined
		 * 
		 */
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		double maxDistance = 0;
		for (int i = 0; i < numCircles; i++) {
			for (int j = i; j < numCircles ; j++) {
				double tempDistance = circles[i].distance(circles[j]);
				if (tempDistance > maxDistance) {
					maxDistance = tempDistance;
					x1 = circles[i].getCoor_x(); // The x coordinate of one of the two most distant circles
					x2 = circles[j].getCoor_x(); // The other x coordinate of one of the two most distant circles
					y1 = circles[i].getCoor_y(); // The y coordinate of one of the two most distant circles
					y2 = circles[j].getCoor_y(); // The other y coordinate of one of the two most distant circles
				}
			}
		}
		// draw circle
		StdDraw.setPenRadius(0.006);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.line(x1, y1, x2, y2);
	}
}
