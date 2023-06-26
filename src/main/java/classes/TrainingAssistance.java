package classes;

import interfaces.Training;

public class TrainingAssistance implements Training{

    private static final double MAX_COEFFICIENT = 0.5;
    private int trainingCost;
    private double trainingAssistanceCoefficient;

    public TrainingAssistance(int trainingCost, double trainingAssistanceCoefficient) {
        this.trainingCost = trainingCost;
        this.trainingAssistanceCoefficient = trainingAssistanceCoefficient;
    }

    @Override
    public String toString() {
        return "TrainingAssistance{" +
                "trainingCost=" + trainingCost +
                ", trainingAssistanceCoefficient=" + trainingAssistanceCoefficient +
                '}';
    }

    @Override
    public double getTrainingAssistance() {
        if (trainingAssistanceCoefficient < MAX_COEFFICIENT)
            return trainingCost * trainingAssistanceCoefficient;
        return trainingCost * MAX_COEFFICIENT;
    }
}


