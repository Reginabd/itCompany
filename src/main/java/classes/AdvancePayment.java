package classes;

import interfaces.OfficeSupplyPayment;

public class AdvancePayment implements OfficeSupplyPayment{

    private int officeSupplyAmount;
    private double advancePaymentCoefficient;

    public AdvancePayment(int officeSupplyAmount, double advancePaymentCoefficient) {
        this.officeSupplyAmount = officeSupplyAmount;
        this.advancePaymentCoefficient = advancePaymentCoefficient;
    }

    @Override
    public String toString() {
        return "AdvancePayment{" +
                "officeSupplyAmount=" + officeSupplyAmount +
                ", advancePaymentCoefficient=" + advancePaymentCoefficient +
                '}';
    }

    @Override
    public double getAdvancePayment() {
        return officeSupplyAmount * advancePaymentCoefficient;
    }
}

