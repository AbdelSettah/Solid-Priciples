package solid.ocp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

	private static final Logger LOG = Logger.getLogger(Test.class.getSimpleName());

	public static void main(String[] args) {
		AreaCalculator c = new AreaCalculator();
		double area = c.area(new Shape[] { new Rectangle(2, 3), new Circle(2) });
		if (LOG.isLoggable(Level.INFO)) {
			LOG.info(String.valueOf(area));
		}
	}

}
