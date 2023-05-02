package details;

public abstract class Employee{

  private int Employee_Id;
  private String First_Name;
  private String Last_Name;
  private String Email;
  private String Phone_Number;
  private String Job_Id;
  private double Salary;

    public Employee(int employee_Id, String first_Name, String last_Name, String email, String phone_Number, String job_Id, double salary) {
    this.Employee_Id = employee_Id;
    this.First_Name = first_Name;
    this.Last_Name = last_Name;
    this.Email = email;
    this.Phone_Number = phone_Number;
    this.Job_Id = job_Id;
    this.Salary = salary;
    }

    public void EmployeeDetail()
  {

  }


    public int getEmployee_Id() {
        return Employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        Employee_Id = employee_Id;
    }
    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }
    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getJob_Id() {
        return Job_Id;
    }

    public void setJob_Id(String job_Id) {
        Job_Id = job_Id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee_Id=" + Employee_Id +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                ", Job_Id='" + Job_Id + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}
