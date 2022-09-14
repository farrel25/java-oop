class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person() {
        this(null); // optional
    }

    Person(String paramName) {
        // name = paramName;
        this(paramName, null);
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}
