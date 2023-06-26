package classes;

import java.util.Objects;

final class Branch{
    final static void branchDetails() {
        int Branch_Account = 1185569854;
        System.out.println("Branch Account Details: ");
        System.out.println("Branch Account number: " + Branch_Account);
    }

    private int branchID;
    private String branchName;

    public void Branch(int branch_ID, String branch_Name) {
        this.branchID = branch_ID;
        this.branchName = branch_Name;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "Branch_ID=" + branchID +
                ", Branch_Name='" + branchName + '\'' +
                '}';
    }

   // @Override
  //  public boolean equals(Object object) {
   //     if (this == object) return true;
    //    if (!(object instanceof Branch branch)) return false;
     //   return getBranchID() == branch.getBranchID() && Objects.equals(getBranchName(), branch.getBranchName());
  //  }

    @Override
    public int hashCode() {
        return Objects.hash(getBranchID(), getBranchName());
    }
}


