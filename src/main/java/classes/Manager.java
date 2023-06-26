package classes;

public class Manager extends Employee{

    protected int managerID;
    protected String positionType;
    protected String employmentType;

    protected int extNumber;
    protected String address;


    public Manager(int employee_Id, String first_Name, String last_Name, String email, String phone_Number, String department, double salary, int managerID, String positionType, String employmentType, int extNumber, String address) {
        super(employee_Id, first_Name, last_Name, email, phone_Number, department, salary);
        this.managerID = managerID;
        this.positionType = positionType;
        this.employmentType = employmentType;
        this.extNumber = extNumber;
        this.address = address;
    }



    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public int getExtNumber() {
        return extNumber;
    }

    public void setExtNumber(int extNumber) {
        this.extNumber = extNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", managerID=" + managerID +
                ", positionType='" + positionType + '\'' +
                ", employmentType=" + employmentType +
                ", extNumber=" + extNumber +
                ", address='" + address;
    }

}
