public class SUVCar extends BaseCar {

    private int id;
    private String type = "SUVCAR";


    public SUVCar( int uid ){
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
        return "SUV"+this.id;
    }
    @Override
    public int getRate() {
        return 30;
    }

}
