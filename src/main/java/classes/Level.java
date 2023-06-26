package classes;

public class Level extends EmployeeDetails{
    public String name;

    public Level(String name, String levelName) {
        super();
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
        return "Level" +
                " name= " + name;
    }
}
