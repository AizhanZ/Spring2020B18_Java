package day39_AccessModifiers;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Rustam");

        System.out.println(employee1);
        //it gives hashcode because we have to specify toString method in custom class

        Employee employee2 = new Employee("John", "Mechanic");

        System.out.println(employee2);

        Employee employee3 = new Employee("Saban", "SDET", 123);

        System.out.println(employee3);

        Employee employee4 = new Employee("Ozgur", "SDET", 456, 120000);

        System.out.println(employee4);

        Employee employee5 = new Employee("Osman", "SDET", 789, 120005, 'M');
        System.out.println(employee5);

    }
}
