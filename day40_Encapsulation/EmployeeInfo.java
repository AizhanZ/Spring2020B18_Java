package day40_Encapsulation;

public class EmployeeInfo {

    private double Salary;
    private long SSN;
    private int ID;
    private String Address;

    public static String companyName = "Bank of America";

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {//should be this.Salary in arguments but when the name is different there is no need to use this
        Salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
