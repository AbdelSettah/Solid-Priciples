package solid.lsp;

import java.util.Calendar;
import java.util.Date;

public class AnnualMember extends Member implements Database,Booking {

	public AnnualMember(String name,Date mStart) {
		super(name);
		this.type = "Annual";
		this.memberShipStartDate = mStart;
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 1);
		this.memberShipEndDate = c.getTime();
	}
	
	@Override
	public void addToDatabase() {
		System.out.println("Added AnnualMember to DB!");
	}
	
	@Override
	public void makeBooking() {
		System.out.println("annualmember does booking");
	}

}
