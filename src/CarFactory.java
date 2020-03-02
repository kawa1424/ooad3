public class CarFactory {
    //use getShape method to get object of type shape
    //referenced from: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
    public BaseCar getCar(String carType, Integer id){
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("ECONOMYCAR")){
            return new EconomyCar(id);

        } else if(carType.equalsIgnoreCase("LUXURYCAR")){
            return new LuxuryCar(id);

        } else if(carType.equalsIgnoreCase("MINIVANCAR")){
            return new MinivanCar(id);

        } else if(carType.equalsIgnoreCase("STANDARDCAR")){
            return new StandardCar(id);

        } else if(carType.equalsIgnoreCase("SUVCAR")){
            return new SUVCar(id);

        }

        return null;
    }
}
