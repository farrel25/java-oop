package farrel.putra.data;

import farrel.putra.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"})
public interface Car extends HasBrand{
    void drive();
    int getTier();

    default boolean isBig() {
        return false;
    }
}
