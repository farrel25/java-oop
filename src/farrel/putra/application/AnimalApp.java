package farrel.putra.application;

import farrel.putra.annotation.Fancy;
import farrel.putra.data.Animal;
import farrel.putra.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
