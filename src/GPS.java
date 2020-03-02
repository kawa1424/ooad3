public class GPS extends CarDecorator {
    Car car;
    public int rate = 3;

    public GPS(Car car) {
        this.car = car;
    }

    public String addPackage(){
        return this.car.addPackage() + addPackageWithGPS();
    }

    private String addPackageWithGPS() {
        return " with GPS";
    }

    public int getRate() {
        return this.car.getRate() + this.rate;
    }

    @Override
    public String getLicense(){
        return this.car.getLicense();
    }
}
