public class CustomerFactory {

    public Customer getCustomer(String customerType, String customerName){ //same idea as car factory
        //instantiate new type of customer depending on the given type
        if(customerType == null){
            return null;
        }
        if(customerType.equalsIgnoreCase("BUSINESS")){
            return new BusinessCustomer(customerName);

        } else if(customerType.equalsIgnoreCase("CASUAL")){
            return new CasualCustomer(customerName);

        } else if(customerType.equalsIgnoreCase("REGULAR")){
            return new RegularCustomer(customerName);

        }

        return null;
    }
}
