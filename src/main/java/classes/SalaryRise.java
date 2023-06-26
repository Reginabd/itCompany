package classes;

import interfaces.Salary;

public class SalaryRise implements Salary{

    private int baseSalary;
    private double payRiseCoefficient;

    private static final double MIN_WAGES = 11160;

    public SalaryRise(int baseSalary, double payRiseCoefficient) {
        this.payRiseCoefficient = payRiseCoefficient;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "SalaryRise{" +
                "baseSalary=" + baseSalary +
                ", payRiseCoefficient=" + payRiseCoefficient +
                '}';
    }

    @Override
    public double getSalaryRise() {
        return baseSalary * payRiseCoefficient;
    }

    //Custom exception

    public static void checkMinWage (double salary) {
        if (salary < MIN_WAGES);
        }
    }




