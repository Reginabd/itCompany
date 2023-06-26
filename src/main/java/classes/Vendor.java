package classes;

public class Vendor{
    private String vendorID;
    private String vendorName;
    private int vendorPhoneNumber;
    private String vendorLocation;


    public Vendor(String vendorID, String vendorName, int vendorPhoneNumber, String vendorLocation) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.vendorLocation = vendorLocation;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(int vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorID='" + vendorID + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", vendorPhoneNumber=" + vendorPhoneNumber +
                ", vendorLocation='" + vendorLocation + '\'' +
                '}';
    }
}
