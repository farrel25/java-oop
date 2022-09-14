package farrel.putra.application;

import farrel.putra.data.City;
import farrel.putra.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); //ERROR
        var city = new City();
        city.name = "Semarang";

        System.out.println(city.name);
    }
}
