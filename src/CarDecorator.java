public abstract class CarDecorator implements Car {
    // This is the decorator pattern
    //used textbook and https://www.baeldung.com/java-decorator-pattern
    public abstract String addPackage();
    public abstract int getRate();
}
