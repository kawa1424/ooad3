public class LuxuryCar extends BaseCar {
    private int id;
    private String type = "LUXURYCAR";

    public LuxuryCar( int uid ){
        this.id = uid;
    }

    @Override
    public String addPackage() {
        return "Luxury car";
    }
    public String getCarType() {
        return this.type;
    }
    @Override
    public String getLicense() {
        return "LUX"+this.id;
    }
    @Override
    public int getRate() {
        return 50;
    }
}
