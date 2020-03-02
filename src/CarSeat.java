import java.util.Random;

public class CarSeat extends CarDecorator {
    Car car;
    private int numSeats;
    private int rate = 1;

    public CarSeat(Car car) {
        Random r = new Random();
        this.numSeats = r.nextInt(5);
        this.car = car;
    }


    public String addPackage(){
        return this.car.addPackage() + addPackageWithCarSeats();
    }

    private String addPackageWithCarSeats() {
        return " with " + this.numSeats +" car seat(s)";
    }

    public int getRate() {
        return this.car.getRate() + this.rate*this.numSeats;
    } //return the rate adding the new rate
    //of the cost of the original car + 1 for the rate of the carseat
    @Override
    public String getLicense(){
        return this.car.getLicense();
    }
}
