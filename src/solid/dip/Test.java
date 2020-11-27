package solid.dip;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Developer d1 = new FrontEndDeveloper();
		Developer d2 = new BackEndDeveloper();
		List<Developer> list = Arrays.asList(d1,d2);
		Project p1 = new Project(list);
		p1.implement();
	}

}
