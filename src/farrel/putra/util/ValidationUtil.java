package farrel.putra.util;

import farrel.putra.annotation.NotBlank;
import farrel.putra.error.BlankException;

import java.lang.reflect.Field;

public class ValidationUtil {

//    public static void validate() {}

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields(); // untuk mendapatkan semua field terlepas dari apapun access modifier nya

        for (var field : fields) {
            /**
             * mungkin saja ada field yg private.
             * Namun kita tetep perlu bisa mengaksesnya jika
             * field tersebut menggunakan Annotation.
             * Maka digunakanlah setAccessible(true)
              */
            field.setAccessible(true);

            /**
             * getAnnotation(NotBlank.class)
             * Untuk mengetahui apakah di field tersebut ada Annotation NotBlank atau tidak
             */
            if (field.getAnnotation(NotBlank.class) != null) {
                // validate
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses " + field.getName());
                }
            }
        }
    }
}
