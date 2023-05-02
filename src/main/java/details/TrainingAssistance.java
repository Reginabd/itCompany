package details;

public class TrainingAssistance implements Training{

    private static final double MAXCOEFFICIENT = 0.5;
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
            if(trainingAssistanceCoefficient < MAXCOEFFICIENT)
            return trainingCost * trainingAssistanceCoefficient;
        return trainingCost * MAXCOEFFICIENT;
    }
    }


