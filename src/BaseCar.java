public class BaseCar implements Car {

    @Override
    public String addPackage(){
        return "Basic car";
    }

    public String getCarType(){
        return "Base car";
    }

    public String getLicense() {return "BAS000";}

    public int getRate() {
        return 0;
    }
}
