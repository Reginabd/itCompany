package details;

public class TuitionAssistance implements Payment{

    private int employeeTuition;
    private double tuitionAssistanceCoefficient;

    public TuitionAssistance(int employeeTuition, double tuitionAssistanceCoefficient) {
        this.employeeTuition = employeeTuition;
        this.tuitionAssistanceCoefficient = tuitionAssistanceCoefficient;
    }

    @Override
    public String toString() {
        return "TuitionAssistance{" +
                "employeeTuition=" + employeeTuition +
                ", tuitionAssistanceCoefficient=" + tuitionAssistanceCoefficient +
                '}';
    }

    @Override
    public double getTuitionAssistance() {
        return  employeeTuition * tuitionAssistanceCoefficient;
    }
}
