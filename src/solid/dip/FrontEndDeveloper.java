package solid.dip;

public class FrontEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavaScript();
    }
    private void writeJavaScript() {
    	System.out.println("write javascript");
    }
}
