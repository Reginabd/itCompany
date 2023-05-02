package details;

import static details.Client.Client_ID;
import static details.Client.Client_Name;

//Creating the main class
public class Main{

    public static void main(String[] args) {

        //Creating object of Manager class
        Manager man1 = new Manager(555, "Cora", "Robertson", "cora@gmail.com", "7859876598","KKJS", 50000, 554, "QA", 1, 335 , "900 W Rochelle road, Irving, Texas, 75062");
        System.out.println("Employee details:");
        System.out.println("Manager details:");

        // Access the methods within the man1 object

        System.out.println("Employee ID: " + man1.getEmployee_Id());
        System.out.println("First Name: " + man1.getFirst_Name());
        System.out.println("Last Name: " + man1.getLast_Name());
        System.out.println("Email: " + man1.getEmail());
        System.out.println("Phone Number: " + man1.getPhone_Number());
        System.out.println("Job ID: " + man1.getJob_Id());
        System.out.println("Salary: " + man1.getSalary());
        System.out.println("Manager ID: " + man1.getManagerID());
        System.out.println("Department: " + (man1.getDepartment()));
        System.out.println("Extension Number: " + man1.getExt_Number());
        System.out.println("Employee Address: " + man1.getAddress());

       // Interfaces
        Salary sal1 =  new SalaryRise(10000, 1.15);
        System.out.println("");
        System.out.println("Revised salary: " + sal1.getSalaryRise());

        Payment paym1 = new TuitionAssistance(5000, 0.5);

        System.out.println("");
        System.out.println("Tuition assistance provided to employee: " + paym1.getTuitionAssistance());

        OfficeSupplyPayment off1 = new AdvancePayment(250, 0.3);

        System.out.println("");
        System.out.println("Advance payment for Office Supply: " + off1.getAdvancePayment());

        Benefits ben1 = new MedicalAssistance(200, 0.7);
        System.out.println("");
        System.out.println("Medical insurance paid by employer: " + ben1.getMedicalAssistance());

        Training tr1 = new TrainingAssistance(1250, 0.4);

        System.out.println("");
        System.out.println("Personal training assistance paid by employer: " + tr1.getTrainingAssistance());

        Training tr2 = new TrainingAssistance(1250, 0.6);

        System.out.println("");
        System.out.println("Personal training assistance paid by employer: " + tr2.getTrainingAssistance());

         //Creating object of Department class
        Department dep1 = new Department();

        // Set the instance values in dep1 object

        dep1.setDepartmentID(4467);

        dep1.setDepartment_Name("Merketing");

        dep1.setDepartment_Head("Tye Orlanis");

        System.out.println("");
        System.out.println("Department details:");

        // Access the methods within the emp1 object
        System.out.println(dep1.getDepartmentID());
        System.out.println(dep1.getDepartment_Name());
        System.out.println(dep1.getDepartment_Head());

        //Creating object of Vendor class
        Vendor ven1 = new Vendor();

        // Set the instance values in ven1 object
        ven1.setVendor_ID("Vendor ID: " + "IIDGHB");
        ven1.setVendor_Name("Vendor Name: " + "Xerox");
        ven1.setVendor_Phone_Number(546_987_896);

        System.out.println("");
        System.out.println("Vendor details:");

        // Access the methods within the ven1 object
        System.out.println(ven1.getVendor_ID());
        System.out.println(ven1.getVendor_Name());
        System.out.println(ven1.getVendor_Phone_Number());


        //Creating object of Branch class
        Branch bran1 = new Branch();

        // Set the instance values in bran1 object
        bran1.setBranch_ID(6247);
        bran1.setBranch_Name("Branch Name: " + "Dallas");
        System.out.println("");
        System.out.println("Branch details:");

        Branch bran2 = new Branch();
        bran2.branchDetails();

        // Access the methods within the bran1 object
        System.out.println(bran1.getBranch_ID());
        System.out.println(bran1.getBranch_Name());

        System.out.println("");
        System.out.println("Client details:");
        System.out.println("Client ID: " + Client_ID);
        System.out.println("Client Name: " + Client_Name);

        Service serv1 = new Service();

        // Set the instance values in serv1 object
        serv1.setService_ID(17);
        serv1.setService_Type("Web Development");
        System.out.println("");
        System.out.println("Service provided:");

        // Access the methods within the paym1 object
        System.out.println(serv1.getService_ID());
        System.out.println(serv1.getService_Type());


    }
}