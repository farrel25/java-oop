public class VicePresident extends Manager{

    VicePresident(String name) {
//        super(name, null);
        super(name);
    }

    /**
     * overriding method
     * must have the same return type, method name, method parameter, as in parent class
     * but the body of the method can different
     * @param name
     */
    void sayHello(String name) {
        System.out.println("hi " + name + ", my name is VP " + this.name);
    }

}
