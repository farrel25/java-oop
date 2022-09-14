package farrel.putra.data;

//Outer class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //inner class
    public class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // mengakses getName milik Outer class
        public String getCompany() {
            return Company.this.getName();
        }
    }
}
