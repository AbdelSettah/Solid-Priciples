package solid.srp;

public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer("me", 30);
		c1.getListsOfItems().add(new Item(30));
		c1.getListsOfItems().add(new Item(20));
		BillCalculator c = new BillCalculator();
		System.out.println(c.calculateBill(c1, 19));
		System.out.println(c1.getBill());
		ReportGenerator r = new ReportGenerator();
		r.generateReport(c1, "csv");
	}

}
