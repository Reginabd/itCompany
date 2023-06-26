package enums;

import java.util.Arrays;

public enum Enums{
    ;

    public enum Locations{
        CITY("Hollywood"),
        COUNTY("Broward"),
        STATE("Florida");

        private String name;

        Locations(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static Locations getByValue(String nameOfLocations) {
            return Arrays.stream(Locations.values())
                    //Non terminal operation
                    .filter(e -> e.name.equals(nameOfLocations))
                    //Terminal operation
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s. ", nameOfLocations)));
        }

        public static Locations getByValues(String nameOfLocations) {
            for (Locations location : Locations.values()) {
                if (location.name.equals(nameOfLocations)) {
                    return location;
                }

            }
            throw new IllegalStateException(String.format("Unsupported type %s. ", nameOfLocations));
        }
    }


    public enum CareerLevels{
        SOFTWARE_ENGINEER("L1"),
        SENIOR_ENGINEER("L2"),
        STAFF_ENGINEER("L3"),
        PRINCIPAL_ENGINEER("L4");

        private String name;

        CareerLevels(String levelName) {
            this.name = levelName;
        }

        public String getName() {
            return name;
        }
    }

    public enum EmploymentTypes{
        TEMPORARY("Contract"),
        PERMANENT("Full Time employee");
        private String name;

        EmploymentTypes(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum PositionTypes{
        ADMINISTRATIVE("HR"),
        TECHNICAL("DevOps");
        private String positionName;

        PositionTypes(String positionName) {
            this.positionName = positionName;
        }

        public String getPositionName() {
            return positionName;
        }
    }

    public enum Departments{
        SALES("Web Sales"),
        FINANCE("Accounting"),
        DEVELOPMENT("Integration");
        private String departmentName;

        Departments(String departmentsName) {
            this.departmentName = departmentsName;
        }

        public String getDepartmentName() {
            return departmentName;
        }
    }
}





