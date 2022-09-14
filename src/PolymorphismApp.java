public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Farrel");
        employee.sayHello("Jihan");
        System.out.println(employee.name);

        employee = new Manager("Athaillah");
        employee.sayHello("Jihan");
        System.out.println(employee.name);

        employee = new VicePresident("Putra");
        employee.sayHello("Jihan");
        System.out.println(employee.name);

        sayHello(new Employee("Farrel"));
        sayHello(new Manager("Athaillah"));
        sayHello(new VicePresident("Putra"));
    }

    static void sayHello(Employee employee) {
        // object type check and casts
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
