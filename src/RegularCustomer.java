import java.util.Random;

public class RegularCustomer implements Customer{

    private int numNights;
    private int numCars;
    private String custName;
    public String custType = "Regular";

    public RegularCustomer( String name) {
        Random r = new Random();
        numNights = r.nextInt((5 - 3) + 1) + 3; //random generator for nights and num cars
        Random r1 = new Random();
        numCars = r1.nextInt(3)+1;
        custName = name;
    }

    public int getNumNights() {
        return numNights;
    }

    public int getNumCars() {
        return numCars;
    }
    public String getCustName() {
        return custName;
    }
    public String getCustType() { return this.custType; }
}
