package day02_Variables;

public class EmployeeInfo_Variables {

    public static void main(String[] args) {
        /*
        print:
                your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary
                SSN
         */
        String employeeName = "Andrea";
        String companyName = "Oracle";
        int employeeId = 9;
        String JobTitle = "QA";
        double salary = 100000.50;
        long ssn = 12356789;

        System.out.println("Employee name: " + employeeName);
        System.out.println("Company name: " + companyName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job title: " + JobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Social Security Number: " + ssn);

        System.out.println("Employee name: "+employeeName+"\nCompany name: "+companyName+"" +
                "\nEmployee Id: "+employeeId+"\nJob Title: "+JobTitle+
                "\nSalary: "+salary+"\nSSN: "+ssn);


    }

}
