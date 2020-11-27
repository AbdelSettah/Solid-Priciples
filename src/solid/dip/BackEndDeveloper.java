package solid.dip;

public class BackEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }
    private void writeJava() {
    	System.out.println("write java");
    }
}
