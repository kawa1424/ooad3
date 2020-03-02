import java.util.Random;

public class BusinessCustomer implements Customer{
    private int numNights;
    private int numCars;
    private String custName;
    public String custType = "Business";

    public BusinessCustomer(String name) {
        numNights = 7; //set the nights and the numCars
        numCars = 3;
        custName = name;
    }

    public int getNumNights() {
        return numNights;
    }

    public int getNumCars() {
        return numCars;
    } //getters
    public String getCustName() {
        return custName;
    }
    public String getCustType() { return this.custType; }
}
