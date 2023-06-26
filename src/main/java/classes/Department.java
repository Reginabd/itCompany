package classes;

public class Department{

    private int departmentID;
    private String departmentName;
    private String departmentHead;

    public void Department(String department_Name, String department_Head) {
        this.departmentName = department_Name;
        this.departmentHead = department_Head;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentID=" + departmentID +
                ", Department_Name='" + departmentName + '\'' +
                ", Department_Head='" + departmentHead + '\'' +
                '}';
    }

}
