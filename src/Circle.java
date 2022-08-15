import java.awt.Color;

/**
 * circle class with x y coordinats and r radius
 * 
 * @author Talha Guzel 041802046
 * @since 15.03.2020
 */
public class Circle {

	private double coor_x;
	private double coor_y;
	private double radius;

	// constructer opened
	Circle(double coor_x, double coor_y, double radius) {
		this.setCoor_x(coor_x);
		this.setCoor_y(coor_y);
		this.setRadius(radius);
	}

	/*
	 * circumscribed by giving specific features to the circle
	 */
	public void draw() {
		double circle_border_thickness = 0.002;

		Color circle_color = StdDraw.BLACK;
		StdDraw.setPenColor(circle_color); // color of the pen
		StdDraw.setPenRadius(circle_border_thickness); // thickness of the pen
		StdDraw.circle(coor_x, coor_y, radius); // draw circle
		StdDraw.show();
	}

	/*
	 * The distance formula was used to find the two most distant circles
	 */
	public double distance(Circle inputCircle) {

		double inputCircleX = inputCircle.getCoor_x();
		double inputCircleY = inputCircle.getCoor_y();
		double distance = Math.sqrt((inputCircleX - this.getCoor_x()) * (inputCircleX - this.getCoor_x())
				+ (inputCircleY - this.getCoor_y()) * (inputCircleY - this.getCoor_y()));
		// distance calculated using mathematical formula
		return distance;
	}

	/*
	 * get and set methods are used because they are private
	 */
	public double getCoor_x() {
		return coor_x;
	}

	public void setCoor_x(double coor_x) {
		this.coor_x = coor_x;
	}

	public double getCoor_y() {
		return coor_y;
	}

	public void setCoor_y(double coor_y) {
		this.coor_y = coor_y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}