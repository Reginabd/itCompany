package details;

public class Manager extends Employee{

    protected int ManagerID;
    protected String Department;
    protected int DepartmentID;

    protected int Ext_Number;
    protected String Address;
    public Manager(int employee_Id, String first_Name, String last_Name, String email, String phone_Number,  String job_Id, double salary, int managerID, String department, int departmentID, int ext_Number, String address) {
        super(employee_Id, first_Name, last_Name, email, phone_Number, job_Id, salary);
        this.ManagerID = managerID;
        this.Department = department;
        this.DepartmentID = departmentID;
        this.Ext_Number = ext_Number;
        this.Address = address;
    }
        public int getManagerID() {
        return ManagerID;
    }

    public void setManagerID(int managerID) {
        ManagerID = managerID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ManagerID=" + ManagerID +
                ", Department='" + Department + '\'' +
                ", DepartmentID=" + DepartmentID +
                ", Ext_Number=" + Ext_Number +
                ", Address='" + Address + '\'' +
                '}';
    }

    public int getExt_Number() {
        return Ext_Number;
    }

    public void setExt_Number(int ext_Number) {
        Ext_Number = ext_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
        public void EmployeeDetail() {
          System.out.println("EmployeeDetails");
    }

}
