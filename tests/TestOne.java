import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//@RunWith(Parameterized.class)
public class TestOne {
    CasualCustomer casual_cust;
    RegularCustomer reg_cust;
    BusinessCustomer bus_cust;

    SUVCar suv_car;
    LuxuryCar lux_car;
    EconomyCar economy_car;
    StandardCar standard_car;
    MinivanCar minivan_car;

    SatelliteRadio radio;
    CarSeat carseat;
    GPS gps;

    Store store;



    @Before
    public void setup() {
        casual_cust = new CasualCustomer("cascustomer");
        reg_cust = new RegularCustomer("regcust");
        bus_cust = new BusinessCustomer("buscust");

        suv_car = new SUVCar(1);
        lux_car = new LuxuryCar(2);
        economy_car = new EconomyCar(3);
        standard_car = new StandardCar(4);
        minivan_car = new MinivanCar(5);

        radio = new SatelliteRadio(suv_car);
        carseat = new CarSeat(suv_car);
        gps = new GPS(suv_car);

        store = new Store("store_one");



        //Assert.assertTrue(cas_cust.get_nights()>=1 && reg_cust.get_nights()<=3);

    }
    @Test
    public void number_cars() {
        Assert.assertTrue(casual_cust.get_number_cars() == 1);
        Assert.assertTrue(reg_cust.get_number_cars()>=1 && reg_cust.get_number_cars()<=3);
        Assert.assertTrue(bus_cust.get_number_cars() == 3);
    }
    @Test
    public void number_nights() {
        Assert.assertTrue(casual_cust.get_nights()>=1 && casual_cust.get_nights()<=3);
        Assert.assertTrue(reg_cust.get_nights()>=3 && reg_cust.get_nights()<=5);

        Assert.assertTrue(bus_cust.get_nights() == 7);
        //System.out.println("hi" +bus_cust.get_nights());

    }
    @Test
    public void customer_names() {
        Assert.assertTrue(casual_cust.name == "cascustomer");
        Assert.assertTrue(reg_cust.name == "regcust");
        Assert.assertTrue(bus_cust.name == "buscust");

    }



    @Test
    public void car_name(){
        Assert.assertTrue(standard_car.name =="Standard");
        Assert.assertTrue(minivan_car.name =="Minivan");
        Assert.assertTrue(lux_car.name =="Luxury");
        Assert.assertTrue(suv_car.name=="SUV");
        Assert.assertTrue(economy_car.name=="Economy");
    }

    @Test
    public void car_id() {
        Assert.assertTrue(standard_car.get_id() == 4);
        Assert.assertTrue(minivan_car.get_id() == 5);
        Assert.assertTrue(lux_car.get_id() == 2);
        Assert.assertTrue(suv_car.get_id() == 1);
        Assert.assertTrue(economy_car.get_id() == 3);
    }

    @Test
    public void car_rate() {
        Assert.assertTrue(lux_car.get_rate() == 50 );
        Assert.assertTrue(suv_car.get_rate() == 30);
        Assert.assertTrue(economy_car.get_rate() == 10);
        Assert.assertTrue(standard_car.get_rate() == 20);
        Assert.assertTrue(minivan_car.get_rate() == 40);


    }

    @Test
    public void add_on_rate() {
        Assert.assertTrue(radio.get_rate() == 5);
        Assert.assertTrue(gps.get_rate() == 3);
        Assert.assertTrue(carseat.get_rate() == 1);

    }

    @Test
    public void add_on_name() {
        Assert.assertTrue(radio.getName().equalsIgnoreCase("satellite radio"));
        Assert.assertTrue(gps.getName() == "GPS");
        Assert.assertTrue(carseat.getName() == "car seat");
    }

    @Test
    public void Store_instance() {
        Assert.assertTrue(store.get_name() == "store_one");
    }

    @Test
    public void customers_size() {
        Assert.assertTrue(store.get_customers().size() == 12);
    }












}