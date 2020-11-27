package solid.lsp;

import java.util.Calendar;
import java.util.Date;

public class LifetimeMember extends Member implements Database,Booking{

	public LifetimeMember(String name,Date mStart) {
		super(name);
		this.type = "Lifetime";
		this.memberShipStartDate = mStart;
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 70);
		this.memberShipEndDate = c.getTime();
	}
	
	@Override
	public void addToDatabase() {
		System.out.println("Added LifetimeMember to DB!");
	}
	
	@Override
	public void makeBooking() {
		System.out.println("lifetimemember does booking");
	}

}
