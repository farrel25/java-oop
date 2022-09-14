public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("athaillah", "Semarang");
        Person person2 = new Person("athaillah");
        Person person3;
        person3 = new Person();

        person1.name = "Farrel";
        person1.address = "Semarang";
        // person1.country = "Arab"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Jihan");

        person3.sayHello("Jihan");
        person3.name = "Putra";
        person3.sayHello("Jihan");

    }
}
