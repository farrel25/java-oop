package farrel.putra.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Farrel";
        first = first + " " + "Athaillah";
        System.out.println(first);

        String second = "Farrel Athaillah";
        System.out.println(second);

        System.out.println(first == second); // false
        System.out.println("first.equals(second) ->" + first.equals(second)); // true
        /**
         * kalo pake ==
         * bakal false karena 2 objek yg berbeda
         *
         * == kalo dipake di object bakal ngebandingin
         * apakah 2 objek tersebut adalah objek yg sama atau bukan
         * jadi bukan ngebandingin isi dari string nya
         *
         */

        String third = "Farrel Athaillah";

        System.out.println(second == third); // true
        System.out.println("second.equals(third) -> " + second.equals(third)); // true
        /**
         * kenapa second == third true, karena java nge-optimize memory
         * saat kita bikin String dan isi String nya sama persis
         * maka dia tidak akan membuat ulang data String nya di memory
         * tapi bakal ngerefer ke objek yg udah ada
         *
         * kalo equals, bakal ngecek isi dari kontennya
         */
    }
}
