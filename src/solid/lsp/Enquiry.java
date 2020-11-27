package solid.lsp;

import java.util.Date;

public class Enquiry extends Member implements Database {

	public Enquiry(String name, Date date) {
		super(name);
		this.type = "Enquiry";
		this.memberShipStartDate = date;
	}

	@Override
	public void addToDatabase() {
		System.out.println("Added Enquiry to DB!");
	}

}
