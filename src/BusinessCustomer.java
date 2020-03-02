import java.util.Random;

public class BusinessCustomer implements Customer{
    private int numNights;
    private int numCars;
    private String custName;
    public String custType = "Business";

    public BusinessCustomer(String name) {
        numNights = 7;
        numCars = 3;
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
