package farrel.putra.application;

import farrel.putra.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Naratik");

        /**
         * untuk membuat object menggunakan inner class
         * wajib untuk pake object dari outer class nya
         */
        Company.Employee employee = company.new Employee();
        employee.setName("Farrel");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Putra");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
