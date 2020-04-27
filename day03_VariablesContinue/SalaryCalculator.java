package day03_VariablesContinue;

public class SalaryCalculator {

    /*
    Create a class called salary calculator,
    write a program that can calculate the text,
    and salary after tax based on the hourly rate & tax rates

    ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD

     */



    public static void main(String[] args) {
    // DataType variableName = Data;

        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalweeksinAYear = 52;

        // salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalweeksinAYear;
        // gross income - salary before tax

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary
        double federalTax = salary * federalTaxRate;

        // totalTax = stateTax - federalTax;
        double totalTax = stateTax - federalTax;

        // salaryAfterTax = salary - stateTax - federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: $" + salary);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Salary after tax: $" + salaryAfterTax);



    }

}
