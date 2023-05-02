package details;

public class SalaryRise implements Salary{

    private int baseSalary;
    private double payRiseCoefficient;

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
}
