package solid.ocp;

public class Rectangle extends Shape {

	public double Width;
	public double Height;

	public Rectangle(double width, double height) {
		this.Width = width;
		this.Height = height;
	}

	public double Area() {
		return Width * Height;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

}
