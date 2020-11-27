package solid.ocp;

public class Circle extends Shape {

	public double Radius;

	public Circle(double radius) {
		this.Radius = radius;
	}

	public double Area() {
		return Math.pow(Radius, 2) * Math.PI;
	}

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

}
