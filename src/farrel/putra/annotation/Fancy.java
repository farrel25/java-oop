package farrel.putra.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target()
 * untuk memberitahu kalau annotation ini bisa dipakai dimana.
 * Perlu attribute value yang isinya berupa array ElementType.
 * Tulisan value tidak wajib dituliskan, bisa langsung nilai
 * dari attribute value nya aja.
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Fancy {

    /**
     * untuk bikin attribute, perlu dikasih kurung
     * seperti saat membuat method.
     *
     * untuk memberikan default value, perlu
     * menambahkan keyword default
     * diikuti nilai defaultnya.
     *
     * Kalau ada default value, maka saat anotasi
     * ini digunakan, maka tidak wajib memasukkan
     * attribute name().
     *
     */
    String name();
    // String name() default "";

    // tags() memiliki default value berupa array kosong
    String[] tags() default {};
}
