package details;

public class Vendor{
    private String Vendor_ID;
    private String Vendor_Name;
    private int Vendor_Phone_Number;

    public void Vendor(String vendor_ID, String vendor_Name) {
        this.Vendor_ID = vendor_ID;
        this.Vendor_Name = vendor_Name;
    }

    public String getVendor_ID() {
        return Vendor_ID;
    }

    public void setVendor_ID(String vendor_ID) {
        Vendor_ID = vendor_ID;
    }

    public String getVendor_Name() {
        return Vendor_Name;
    }

    public void setVendor_Name(String vendor_Name) {
        Vendor_Name = vendor_Name;
    }

    public int getVendor_Phone_Number() {
        return Vendor_Phone_Number;
    }

    public void setVendor_Phone_Number(int vendor_Phone_Number) {
        Vendor_Phone_Number = vendor_Phone_Number;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "Vendor_ID='" + Vendor_ID + '\'' +
                ", Vendor_Name='" + Vendor_Name + '\'' +
                ", Phone_Number=" + Vendor_Phone_Number +
                '}';
    }
}
