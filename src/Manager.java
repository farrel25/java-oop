class Manager extends Employee{
    // String name;

    String company;

    Manager(String name) {
        // this.name = name;
        super(name);
    }

    Manager(String name, String company) {
        // this.name = name;
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("hi " + name + ", my name is Manager " + this.name);
    }
}
