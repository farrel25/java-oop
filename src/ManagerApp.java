public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Farrel");
//        manager.name = "Farrel";
        manager.sayHello("Jihan");

        var vp = new VicePresident("Putra");
        vp.sayHello("Jana");
        vp.name = "Putra";
        vp.sayHello("Alifah");
        manager.sayHello("Jihan");
    }
}
