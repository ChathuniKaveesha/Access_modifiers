public class Main {
    public static void main(String[] args) {

        AccessModifiersDemo demoInstance = new AccessModifiersDemo();
        demoInstance.privateVar = 10;
        demoInstance.defaultVar = 20.5;
        demoInstance.protectedVar = true;
        demoInstance.publicVar = "Hello, World!";

        System.out.println("Private Variable: " + demoInstance.getPrivateVar());
        System.out.println("Default Variable: " + demoInstance.getDefaultVar());
        System.out.println("Protected Variable: " + demoInstance.getProtectedVar());
        System.out.println("Public Variable: " + demoInstance.getPublicVar());


        SubclassDemo subclassInstance = new SubclassDemo();
        subclassInstance.displayProtectedVar();
    }
}