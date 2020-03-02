public class EconomyCar extends BaseCar {
    private int id;
    private String type = "ECONOMYCAR";
    private String carName;

    public EconomyCar( int uid ){
        this.id = uid;
    }

    @Override
    public String addPackage() {
        return "Economy car";
    }

    public String getCarType() {
        return this.type;
    }
    @Override
    public String getLicense() {
        return "ECO"+this.id;
    } //generate new license for the specific care type
    @Override
    public int getRate() {
        return 10;
    }
}
