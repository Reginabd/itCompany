package classes;

public abstract class EmployeeDetails{

    public String name;

    public EmployeeDetails() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                '}';
    }
}
