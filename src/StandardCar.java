public class StandardCar extends BaseCar{
    private int id;
    private String type = "STANDARDCAR";

    public StandardCar( int uid ){
        this.id = uid;
    }
    @Override
    public String addPackage() {
        return "Standard car";
    }
    public String getCarType() {
        return this.type;
    }
    @Override
    public String getLicense() {
        return "STD"+this.id;
    }
    @Override
    public int getRate() {
        return 20;
    }
}
