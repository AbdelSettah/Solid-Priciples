package solid.lsp;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test {
		public static void main(String[] args){
		Booking m1 = new AnnualMember("me", new Date());
		Booking m2 = new LifetimeMember("aymen", new Date());
		List<Booking> members = Arrays.asList(m1,m2);
		members.forEach(m->m.makeBooking());
	}
 
}