package classes;

import interfaces.Benefits;

public class MedicalAssistance implements Benefits{

    private int medicalInsurance;
    private double medicalAssistanceCoefficient;

    public MedicalAssistance(int medicalInsurance, double medicalAssistanceCoefficient) {
        this.medicalInsurance = medicalInsurance;
        this.medicalAssistanceCoefficient = medicalAssistanceCoefficient;
    }

    @Override
    public String toString() {
        return "MedicalAssistance{" +
                "medicalInsurance=" + medicalInsurance +
                ", medicalAssistanceCoefficient=" + medicalAssistanceCoefficient +
                '}';
    }

    @Override
    public double getMedicalAssistance() {
        return medicalInsurance * medicalAssistanceCoefficient;
    }
}

