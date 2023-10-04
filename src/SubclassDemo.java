public class SubclassDemo extends AccessModifiersDemo {

    public void displayProtectedVar() {
        System.out.println("Protected Variable Value (from Subclass): " + getProtectedVar());
    }
}
