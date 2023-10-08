import repository.Decor.BaseSalary;
import repository.Decor.Bonus;
import repository.Decor.Penalty;
import repository.Decor.Premium;
import repository.Salary;

import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULATE SALARY");
        System.out.println("Enter the base Salary of employee");
        long baseSalaryAmount = sc.nextLong();

        Salary baseSalary = new BaseSalary(baseSalaryAmount);
        printSalary("Base Salary", baseSalary);

        Salary premium = new Premium(baseSalary);
        printSalary("Premium", premium);

        Salary bonus = new Bonus(premium);
        printSalary("Bonus", bonus);

        Salary penalty = new Penalty(bonus);
        printSalary("Penalty", penalty);

        printSalary("Total Salary", penalty);
    }

    private static void printSalary(String description, Salary salary) {
        double amount = salary.getSalary();
        String text = salary.getText();
        System.out.println(description + ": " + text + ": $" + amount);
    }
}
