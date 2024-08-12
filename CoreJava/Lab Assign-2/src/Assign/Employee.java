package Assign;

import java.util.Scanner;

class Employee1 {
    String name;
    String title;
    double salary;
    double grossSalary;
    double totalAllowances;
    double benefits;
    double bonuses;

    void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gross Salary, Total Allowances, Benefits, and Bonuses:");
        grossSalary = sc.nextDouble();
        totalAllowances = sc.nextDouble();
        benefits = sc.nextDouble();
        bonuses = sc.nextDouble();

        salary = grossSalary - (totalAllowances + benefits + bonuses);
        System.out.println("Net Salary: " + salary);
    }
}

public class Employee {

    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.calculateSalary();
    }
}
