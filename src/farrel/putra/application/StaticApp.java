package farrel.putra.application;

import farrel.putra.data.Application;
//import farrel.putra.data.Constant;
import static farrel.putra.data.Constant.*;
import farrel.putra.data.Country;
import farrel.putra.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        // System.out.println(Constant.APPLICATION);
        // System.out.println(Constant.VERSION);

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Semarang");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
