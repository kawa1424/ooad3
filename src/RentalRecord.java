public class RentalRecord {
    private String custName;
    private String carLicense;
    private int custNumNights;
    private int returnDate;
    private Car currCar;
    private int fees;
    private String custType;


    public RentalRecord(Car car, Customer customer, int day, int cost) {
        this.currCar = car; //instantiate variables
        this.carLicense = car.getLicense();
        this.custName = customer.getCustName();
        this.custNumNights = customer.getNumNights();
        this.returnDate = day+custNumNights;
        this.fees = cost;
        this.custType = customer.getCustType();
    }

    public void createRentalRecord(){
        System.out.println("Rental Record created");
    }

    public String getCustName(){
        return this.custName;
    }
    public String getCarLicense(){
        return this.carLicense;
    }

    public int getReturnDate(){
        return returnDate;
    }

    public Car getCar() {
        return this.currCar;
    }

    public int getFees(){
        return this.fees;
    }

    public int getCustNumNights() {
        return this.custNumNights;
    }

    public String getCustType(){ return this.custType; }
}
