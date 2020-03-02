import java.util.Random;

public class CasualCustomer implements Customer{
    private int numNights;
    private int numCars;
    private String custName;
    public String custType = "Casual";

    public CasualCustomer(String name) {
        Random r = new Random();
        numNights = r.nextInt(3)+1;
        numCars = 1;
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
