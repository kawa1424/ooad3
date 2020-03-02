public class MinivanCar extends BaseCar{
    private int id;
    private String type = "MINIVANCAR";

    public MinivanCar(int uid){
        this.id = uid;
    }

    @Override
    public String addPackage() {
        return "Minivan car";
    }
    public String getCarType() {
        return this.type;
    }
    @Override
    public String getLicense() {
        return "MVN"+this.id;
    }
    @Override
    public int getRate() {
        return 40;
    }
}
