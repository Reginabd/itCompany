package classes;

public class City extends EmployeeDetails{

    public String name;

    public int zipCode;

    public City(String name, int zipCode) {

        this.name = name;
        this.zipCode = zipCode;
    }

    public String getName() {

        return name;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", zipCode=" + zipCode +
                ", name='" + name + '\'' +
                '}';
    }
}
