package farrel.putra.application;

import farrel.putra.data.Customer;
import farrel.putra.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Farrel");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer);
        System.out.println(customer.getName());
        System.out.println(customer.getLevel()); // defaultnya manggil toString() juga
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("\nPrint Levels");
        Level[] levels = Level.values();
        System.out.println(levels);
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
