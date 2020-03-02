public class Main {

    private int totalRevenue = 0;
    public static void main(String args[]){
        Store store = new Store("store one");
        int totalRev = 0;
        for(int day=1; day < 36; day++){
            System.out.println("===== DAY "+day+" =====");
            totalRev += store.rent(day);
            store.returnCars(day);

        }
        System.out.println("======FINAL======");
        System.out.println("Total revenue: $" + totalRev);
        System.out.println("Total rentals: " + store.getTotalRentals());
        System.out.println("Total business rentals: " + store.getTotalBisRentals());
        System.out.println("Total casual rentals: " + store.getTotalCasRentals());
        System.out.println("Total regular rentals: " + store.getTotalRegRentals());
    }
}
