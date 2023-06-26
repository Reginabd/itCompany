package classes;

public abstract class Payment{

    private int paymentID;
    private int paymentAmount;

    protected Payment(int paymentID, int paymentAmount) {
        this.paymentID = paymentID;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
