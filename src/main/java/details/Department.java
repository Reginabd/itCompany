package details;

public class Department{

        private int DepartmentID;
        private String Department_Name;
        private String Department_Head;

    public void Department(String department_Name, String department_Head) {
    this.Department_Name = department_Name;
    this.Department_Head = department_Head;
   }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartment_Name() {
        return Department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        Department_Name = department_Name;
    }

    public String getDepartment_Head() {
        return Department_Head;
    }

    public void setDepartment_Head(String department_Head) {
        Department_Head = department_Head;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentID=" + DepartmentID +
                ", Department_Name='" + Department_Name + '\'' +
                ", Department_Head='" + Department_Head + '\'' +
                '}';
    }

}
