public class SatelliteRadio extends CarDecorator{
    Car car;
    public int rate = 5;
    public SatelliteRadio(Car car) {
        this.car = car;
    }

    public String addPackage(){
        return this.car.addPackage() + addPackageWithSatelliteRadio();
    }

    private String addPackageWithSatelliteRadio() {
        return " with satellite radio";
    }

    public int getRate() {
        return this.car.getRate() + this.rate;
    }

    @Override
    public String getLicense(){
        return this.car.getLicense();
    }

}
