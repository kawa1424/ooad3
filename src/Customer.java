public interface Customer {
    //using a strategy pattern to do different operations for each type of customer for num nights and cars
    public int getNumNights();
    public int getNumCars();
    public String getCustName();
    public String getCustType();
}
