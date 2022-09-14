package farrel.putra.application;

import farrel.putra.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // anonymous class
        // tidak bisa di re use
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Farrel");
    }
}
