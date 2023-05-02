package details;

import java.util.Objects;

final class Branch{
    final static void branchDetails() {
        int Branch_Account = 1185569854;
        System.out.println("Branch Account Details: ");
        System.out.println("Branch Account number: " + Branch_Account);
    }
    private int Branch_ID;
    private String Branch_Name;

        public void Branch(int branch_ID, String branch_Name) {
        this.Branch_ID = branch_ID;
        this.Branch_Name = branch_Name;
    }

    public int getBranch_ID() {
        return Branch_ID;
    }

    public void setBranch_ID(int branch_ID) {
        Branch_ID = branch_ID;
    }

    public String getBranch_Name() {
        return Branch_Name;
    }

    public void setBranch_Name(String branch_Name) {
        Branch_Name = branch_Name;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "Branch_ID=" + Branch_ID +
                ", Branch_Name='" + Branch_Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Branch branch)) return false;
        return getBranch_ID() == branch.getBranch_ID() && Objects.equals(getBranch_Name(), branch.getBranch_Name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBranch_ID(), getBranch_Name());
    }
}
