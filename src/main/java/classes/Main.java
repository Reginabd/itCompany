package classes;

import enums.Enums;
import exceptions.*;
import interfaces.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import threads.ThreadRunnable;
import utils.ConnectionPool;
import utils.ReadingFromFile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.*;
import java.util.stream.Collectors;

import static classes.Client.clientID;
import static classes.Client.clientName;


public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static final String INPUT_FILE = "src/main/resources/input.txt";
    public static final File OUTPUT_FILE = new File("src/main/resources/output.txt");

    private static final int MAX_POOL_SIZE = 5;

    private static final int THREAD_POOL_SIZE = 7;



    public static void main(String[] args) throws SalaryException, TuitionException, AdvancePaymentException, MedicalException, TrainingException, IOException, ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InterruptedException, ExecutionException {
        String log4jConfPath = "C:/Users/regin/IdeaProjects/itCompany/src/main/resources/log4j2.properties";
        PropertyConfigurator.configure(log4jConfPath);
        System.out.println("Log info");
        LOGGER.info("Log Information:");
        LOGGER.debug("Log debug:");

        int uniqueWordsCount = ReadingFromFile.getUniqueWordCountInFile(INPUT_FILE);
        FileUtils.writeStringToFile(OUTPUT_FILE, Integer.toString(uniqueWordsCount));

        System.out.println("");
        System.out.println("Employee details:");

        // Access the methods within the man1 object
        Manager man1 = new Manager(145, "Agatha", "Christie", "achristie@gmail.com", "7857276598", "Taxation", 140000, 173, "Specialist", "Temporary", 142, "302 Grey Street, Houston, TX, 77002");
        System.out.println("Manager ID: " + man1.getEmployeeId());
        System.out.println("First Name: " + man1.getFirstName());
        System.out.println("Last Name: " + man1.getLastName());
        System.out.println("Email: " + man1.getEmail());
        System.out.println("Phone Number: " + man1.getPhoneNumber());
        System.out.println("Job ID: " + man1.getDepartment());
        System.out.println("Salary: " + man1.getSalary());
        System.out.println("Manager ID: " + man1.getManagerID());
        System.out.println("Extension Number: " + man1.getExtNumber());
        System.out.println("Manager Address: " + man1.getAddress());

        // Interfaces
        Salary sal1 = new SalaryRise(18000, 1.15);
        System.out.println();
        System.out.println("Revised salary: " + sal1.getSalaryRise());

        Tuition paym1 = new TuitionAssistance(5000, 0.5);
        System.out.println();
        System.out.println("Tuition assistance provided to employee: " + paym1.getTuitionAssistance());

        OfficeSupplyPayment off1 = new AdvancePayment(250, 0.3);
        System.out.println();
        System.out.println("Advance payment for Office Supply: " + off1.getAdvancePayment());

        Benefits ben1 = new MedicalAssistance(200, 0.7);
        System.out.println();
        System.out.println("Medical insurance paid by employer: " + ben1.getMedicalAssistance());

        Training tr1 = new TrainingAssistance(1250, 0.4);
        System.out.println();
        System.out.println("Personal training assistance paid by employer: " + tr1.getTrainingAssistance());

        Training tr2 = new TrainingAssistance(1250, 0.6);
        System.out.println();
        System.out.println("Personal training assistance paid by employer: " + tr2.getTrainingAssistance());

        //Creating object of Department class
        Department dep1 = new Department();

        // Set the instance values in dep1 object
        dep1.setDepartmentID(4467);
        dep1.setDepartmentName("Marketing");
        dep1.setDepartmentHead("Tye Orlanis");
        System.out.println();
        System.out.println("Department information:");

        // Access the methods within the  dep1 object
        System.out.println(dep1.getDepartmentID());
        System.out.println(dep1.getDepartmentName());
        System.out.println(dep1.getDepartmentHead());

        //Creating object of Vendor class
        Vendor ven1 = new Vendor("OJFF", "Office Depot", 9382981, "New York");
        //   Set the instance values in ven1 object
        ven1.setVendorID("Vendor ID: " + "IIDGHB");
        ven1.setVendorName("Vendor Name: " + "Xerox");
        ven1.setVendorPhoneNumber(546_987_896);
        ven1.setVendorLocation("Dallas");
        System.out.println();
        System.out.println("Vendor information:");

        // Access the methods within the ven1 object
        System.out.println(ven1.getVendorID());
        System.out.println(ven1.getVendorName());
        System.out.println(ven1.getVendorPhoneNumber());
        System.out.println(ven1.getVendorLocation());


        //Creating object of Branch class
        Branch bran1 = new Branch();

        // Set the instance values in bran1 object
        bran1.setBranchID(6247);
        bran1.setBranchName("Branch Name: " + "Dallas");
        System.out.println();
        System.out.println("Branch information:");

        Branch bran2 = new Branch();
        Branch.branchDetails();

        // Access the methods within the bran1 object
        System.out.println(bran1.getBranchID());
        System.out.println(bran1.getBranchName());
        System.out.println();
        System.out.println("Client information:");
        System.out.println("Client ID: " + clientID);
        System.out.println("Client Name: " + clientName);

        Service serv1 = new Service();

        // Set the instance values in serv1 object
        serv1.setServiceID(17);
        serv1.setServiceType("Service information: Web Development");
        System.out.println();
        System.out.println("Service provided:");

        // Access the methods within the serv1 object
        System.out.println(serv1.getServiceID());
        System.out.println(serv1.getServiceType());

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Raising Exceptions:");
        // To raise a user-defined Salary exception
        //Current salary with raise = 20700, to see the exception, change MIN_WAGES to a number bigger than 20700
        final int MIN_WAGES = 20600;
        double currentSalary = (sal1.getSalaryRise());

        try {
            if (currentSalary < MIN_WAGES) {
                throw new SalaryException("Current Salary is: " + currentSalary);
            } else {
                System.out.println("Employee Salary: " + currentSalary);
            }
        } catch (Exception e) {
            LOGGER.error("Employee's salary can't be less than the minimal wages of " + MIN_WAGES);
            throw e;
        }

        // To raise a user-defined exception Assistance Tuition
        //Current tuition assistance = 2500, to see the exception, change MAX_TUITION_ASSISTANCE to a number smaller than 2500
        final int MAX_TUITION_ASSISTANCE = 2600;
        double currentTuitionAssistance = (paym1.getTuitionAssistance());

        try {
            if (currentTuitionAssistance > MAX_TUITION_ASSISTANCE) {
                throw new TuitionException("Current Tuition Assistance payment is: " + currentTuitionAssistance);
            } else {
                System.out.println("Employee Tuition payment: " + currentTuitionAssistance);
            }
        } catch (Exception e) {
            LOGGER.error("Tuition Assistance payment can't be more than maximum payment of " + MAX_TUITION_ASSISTANCE);
            throw e;
        }

        // To raise a user-defined Advance Payment  exception
        //Current advance payment = 75, to see the exception, change MIN_ADVANCED_PAYMENT to a number bigger than 75
        final double MIN_ADVANCED_PAYMENT = 60;
        double currentAdvancePayment = (off1.getAdvancePayment());

        try {
            if (currentAdvancePayment < MIN_ADVANCED_PAYMENT) {
                throw new AdvancePaymentException("Current Advance payment is: " + currentAdvancePayment);
            } else {
                System.out.println("Advance payment: " + MIN_ADVANCED_PAYMENT);
            }
        } catch (Exception e) {
            LOGGER.error("Advanced payment can't be more than minimum payment of " + MIN_ADVANCED_PAYMENT);
            throw e;
        }

        // To raise a user-defined Medical Insurance Payment exception
        //Current medical insurance payment = 140, to see the exception, change MIN_MEDICAL_INSURANCE_PAYMENT to a number bigger than 140
        final double MIN_MEDICAL_INSURANCE_PAYMENT = 140;
        double currentMedicalPayment = (ben1.getMedicalAssistance());
        try {
            if (currentMedicalPayment < MIN_MEDICAL_INSURANCE_PAYMENT) {
                throw new MedicalException("Current Medical Assistance payment is: " + currentMedicalPayment);
            } else {
                System.out.println("Employee Medical Payment: " + MIN_MEDICAL_INSURANCE_PAYMENT);
            }
        } catch (Exception e) {
            LOGGER.warn("Medical insurance payment can't be less than minimal payment of " + MIN_MEDICAL_INSURANCE_PAYMENT);
            throw e;
        }

        // To raise a user-defined Training Assistance Payment exception
        //Current Training Assistance Payment = 500, to see the exception, change MIN_TRAINING_ASSISTANCE_PAYMENT to a number bigger than 500
        final double MIN_TRAINING_ASSISTANCE_PAYMENT = 400;
        double currentTrainingPayment = (tr1.getTrainingAssistance());
        try {
            if (currentTrainingPayment < MIN_TRAINING_ASSISTANCE_PAYMENT) {
                throw new TrainingException("Current Training Assistance payment is: " + currentTrainingPayment);
            } else {
                System.out.println("Employee Training Payment: " + MIN_TRAINING_ASSISTANCE_PAYMENT);
            }
        } catch (Exception e) {
            LOGGER.warn("Training Assistance payment can't be less than minimal payment of " + MIN_TRAINING_ASSISTANCE_PAYMENT);
            throw e;
        }
        // Streams
        // Generic LinkedList
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("Streams, Collections");

        List<String> employees = new LinkedList<>();
        employees.add("Anna Bella");
        employees.add("Enrico Gomez");
        employees.add("Sara Roberts");
        employees.add("Ella Brendan");
        employees.add("Laura Mills");
        employees.add("Edward Chris");

        System.out.println("Print a list of Employee names started with E");
        List<String> filtered = employees.stream()
                .filter(item -> item.startsWith("E"))
                .collect(Collectors.toList());
        System.out.println(filtered);
        String shortest = employees.stream()
                .min(Comparator.comparing(item -> item.length()))
                .get();
        System.out.println(" ");
        System.out.println("Print the shortest Employee name:");
        System.out.println(shortest);
        long count = employees.stream()
                .filter(item -> item.startsWith("E"))
                .count();
        System.out.println(" ");
        System.out.println("Print number of employee names starting with E:");
        System.out.println(count);
        System.out.println("");
        String reduced = employees.stream()
                .filter(item -> item.startsWith("E"))
                .map(item -> item.toUpperCase())
                .reduce("", (e, item) -> e + " " + item);
        System.out.println("Print the upper case employee names starting with E:");
        System.out.println(reduced);

        // ArrayList
        List<Manager> managersList = new ArrayList<>();
        managersList.add(new Manager(23, "Monica", "Kendris", "kendris@gmail.com", "830112223", "QA", 70000, 362, "Finance", "Temporary", 872, "87 Beverly street, Sunny Isles, FL, 33098"));
        managersList.add(new Manager(65, "Anna", "Jones", "jones@gmail.cfom", "987877222", "Accounting", 650000, 981, "Finance", "Permanent", 652, "74 Austin Avenue, Hallandale, FL, 33097"));
        managersList.add(new Manager(54, "Maria", "Lesli", "Developer", "9387362782", "QA", 90000, 9992, "Tender specialist", "Permanent", 42, "424 S Monro street, Hollywood, Florida, 33019"));
        managersList.add(new Manager(12, "Tom", "Michaels", "tmichaels@gmail.com", "8763542542", "Sales", 45000, 12, "Sales", "Permanent", 112, "17 Western Street, Boca Raton, 33076, FL"));
        managersList.add(new Manager(555, "Cora", "Roberts", "cora@gmail.com", "7859876598", "QA", 50000, 73, "Intern", "Temporary", 12, "755 W Snow Street, Dallas, 75099, Texas"));
        managersList.add(new Manager(34, "Josh", "Osborn", "josh@gmail.com", "8765437689", "Support", 150000, 87, "Clients Relations", "Permanent", 456, "877 Grey Street, Houston, 77002"));

        System.out.println("");
        System.out.println("Print a list of Employees of QA department:");
        List<Manager> testers1 = managersList.stream()
                .filter(e -> e.getDepartment().equals("QA"))
                .collect(Collectors.toList());
        testers1.forEach(tester1 -> System.out.println(tester1));

        System.out.println("");
        System.out.println("Print the Employee list with salary more than 50 000:");
        List<Manager> output = managersList.stream()
                .filter(e -> e.getSalary() > 50000)
                .collect(Collectors.toList());
        output.forEach(System.out::println);
        System.out.println(output);

        System.out.println("");
        System.out.println("Print the Employee list salaries in the range $80000-$140000:");
        Predicate<Manager> fourToSixThousand =
                e -> (e.getSalary() >= 80000 && e.getSalary() <= 140000);
        managersList.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("");
        System.out.println("Print the average salary by Departments:");
        Map<String, Double> avgSalaryOfDepartments =
                managersList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet)

            System.out.println(entry.getKey() + " : " + entry.getValue());


        System.out.println("");
        System.out.println("Print Maximum Employee salary:");
        managersList.stream()
                .max(Comparator.comparing(Manager::getSalary))
                .ifPresent(System.out::println);
        System.out.println("");
        System.out.println("Print Employee list sorted by First name:");
        List<Manager> sortedEmployees = managersList.stream().sorted(Comparator.comparing(Manager::getFirstName)).collect(Collectors.toList());
        sortedEmployees.forEach(item -> System.out.println(item));

        //HashSet
        System.out.println(" ");
        HashSet<Vendor> vendorList = new HashSet<>();
        vendorList.add(new Vendor("OKNS", "Xerox", 876256455, "Seattle"));
        vendorList.add(new Vendor("KUFHOSSL", "Ambit Energy", 87615223, "Portland"));
        vendorList.add(new Vendor("OAM", "Staples", 938722345, "Seattle"));
        vendorList.add(new Vendor("MNAFFB", "Spectrum", 762622223, "Baltimore"));
        vendorList.add(new Vendor("PLAN", "Verison", 522345322, "Seattle"));
        vendorList.add(new Vendor("MNVRFA", "UPS", 234532345, "Sacramento"));
        vendorList.add(new Vendor("POAS", "Fedex", 987223563, "Seattle"));

        System.out.println("Print a list of vendors in Seattle:");
        List<Vendor> vendorlocations = vendorList.stream()
                .filter(item -> item.getVendorLocation().equals("Seattle"))
                .collect(Collectors.toList());
        vendorlocations.forEach(location -> System.out.println(location));

        System.out.println(" ");
        System.out.println("Print vendor names starting with X:");
        String vendorNames = vendorList.stream()
                .filter(item -> item.getVendorName().startsWith("X"))
                .map(item -> item.getVendorName().toUpperCase())
                .reduce("", (e, item) -> e + " " + item);
        System.out.println(vendorNames);

        System.out.println(" ");
        System.out.println("Print vendor IDs starting with P:");
        List<Vendor> vendorId = vendorList.stream()
                .filter(item -> item.getVendorID().startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(vendorId);

        System.out.println(" ");
        System.out.println("Print a list of vendors with longest Vendor ID:");
        Vendor longest = vendorList.stream()
                .max(Comparator.comparing(item -> item.getVendorID().length()))
                .get();
        System.out.println(longest);

        System.out.println(" ");
        System.out.println("Print number of Vendor names starting with X:");
        long vendorcount = vendorList.stream()
                .filter(item -> item.getVendorName().startsWith("X"))
                .count();

        System.out.println(vendorcount);

        //Lambda Functions
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Lambda Functions");
        EmployeeDetails cityDetail = new City(Enums.Locations.CITY.getName(), 33013);
        EmployeeDetails levelDetail = new Level("L5", Enums.CareerLevels.STAFF_ENGINEER.getName());

        Employee employee = new Manager(54, "Maria", "Lesli", "Developer", "9387362782", Enums.Departments.DEVELOPMENT.getDepartmentName(),
                90000, 9992, Enums.PositionTypes.TECHNICAL.getPositionName(), Enums.EmploymentTypes.PERMANENT.getName(), 42, "424 S Monro street, Hollywood, Florida, 33019");
        System.out.println(cityDetail);
        System.out.println(levelDetail);
        System.out.println(employee);
        System.out.println("---------------------------------------------");


        //1. Lambda Function to MAP Managers by Employee type
        Manager man2 = new Manager(555, "Cora", "Roberts", "cora@gmail.com", "7859876598", "Taxation", 50000, 73, "Intern", "Temporary", 12, "755 W Snow Street, Dallas, 75099, Texas");
        Function<Manager, String> mapByName = (manager) -> manager.getEmploymentType();
        System.out.println(mapByName.apply(man2));

        //2. Lambda Function to SORT Managers by First Name
        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager(23, "Monica", "Kendris", "kendris@gmail.com", "830112223", "QA", 70000, 362, "Finance",
                "Temporary", 872, "87 Beverly street, Sunny Isles, FL, 33098"));
        managers.add(new Manager(65, "Anna", "Jones", "jones@gmail.cfom", "987877222", "Accounting", 650000, 981, "Finance",
                "Permanent", 652, "74 Austin Avenue, Hallandale, FL, 33097"));
        managers.sort((Manager m1, Manager m2) -> {
            return m1.getFirstName().compareTo(m2.getFirstName());
        });
        System.out.println(managers);

        //3. Lambda Function to FILTER Managers by Age:
        Manager tom = new Manager(12, "Tom", "Michaels", "tmichaels@gmail.com", "8763542542", "Sales", 45000, 12, "Sales", "Permanent", 112, "17 Western Street, Boca Raton, 33076, FL");
        Predicate<Manager> filterByEmployeeId = (manager) -> manager.getEmployeeId() < 65;
        System.out.println(filterByEmployeeId.test(tom));
        System.out.println("---------------------------------------------");

        //Use at least 5 lambda functions from java.util.function package
        Predicate<Manager> isLowPay = m -> m.getSalary() < 100000;
        Consumer<Manager> work = m -> System.out.println("A lot");
        Function<Manager, Double> getSalary = m -> m.getSalary();
        Supplier<Manager> supplier = () -> new Manager(34, "Josh", "Osborn", "josh@gmail.com", "8765437689", "Support", 150000, 87, "Clients Relations", "Permanent", 456, "877 Grey Street, Houston, 77002");
        UnaryOperator<Manager> salaryManager1 = manager -> {
            try {
                manager.setSalary(manager.getSalary() + 10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return manager;
        };

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Streams");
        Enums.Locations locations = Enums.Locations.getByValue("Hollywood");
        System.out.println(locations);

        //1.Reflection Using forName() method
        Class<?> cityClass = Class.forName("classes.City");
        System.out.println("Reflection of City class: " + cityClass);

        System.out.println("---------------------------------------------");
        //2. Using getClass() method
        City c1 = new City("Los Angeles", 90001);
        Class obj = c1.getClass();
        System.out.println(obj);
        System.out.println("---------------------------------------------");
        //3.Using .class extention
        Class c = City.class;
        System.out.println(c);
        System.out.println("---------------------------------------------");
        //4.1 Get name of the class
        String name = c1.getName();
        System.out.println("Name: " + name);
        System.out.println("---------------------------------------------");
        //4.2 get the access modifier of the class
        int modifier = obj.getModifiers();

        //4.3 convert the access modifier to string
        String mod = Modifier.toString(modifier);
        System.out.println("Modifier: " + mod);
        System.out.println("---------------------------------------------");

        //4.4 get the superclass of City
        Class superClass = obj.getSuperclass();
        System.out.println("Superclass: " + superClass.getName());
        System.out.println("---------------------------------------------");

        //5 Using object to class to get all the declared methods of City
        Method[] methods = obj.getDeclaredMethods();

        // Create an object of the Method class
        for (Method m : methods) {
            // get names of the methods
            System.out.println("Method Name: " + m.getName());
            // get access modifier of methods
            modifier = m.getModifiers();
            System.out.println("Modifier: " + Modifier.toString(modifier));
            // get the return types of method
            System.out.println("Return Types: " + m.getReturnType());
        }

        System.out.println("---------------------------------------------");
        System.out.println("Reflection");
        //6. Reflection of Java Fields
        // access and set the type field
        Field field1 = obj.getField("name");
        field1.set(c1, "San Diego");

        //get the value of the field city
        String nameValue = (String) field1.get(c1);
        System.out.println("Value: " + nameValue);

        // get the access modifier of the field breed
        modifier = field1.getModifiers();

        // convert the modifier to String form
        String modifier1 = Modifier.toString(modifier);
        System.out.println("Modifier: " + modifier1);
        System.out.println("---------------------------------------------");

        //access the private field name
        Field field = obj.getDeclaredField("name");

        //allow modifications of the private foeld
        field1.setAccessible(true);

        //set the value of name
        field1.set(c1, "Santa Anna");

        //set the value of field name
        nameValue = (String) field.get(c1);
        System.out.println("Value: " + nameValue);

        //get the value of field name
        int mod2 = field1.getModifiers();

        //convert the access modifier to string
        String modifier2 = Modifier.toString(mod2);
        System.out.println("Modifier: " + modifier2);
        System.out.println("---------------------------------------------");

        // 7 Reflection of Java Constructor
        // Get all constructors od City
        Constructor[] constructors = obj.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            // get the name of constructors
            System.out.println("Constructor Name: " + constructor.getName());
            // get the access modifier of constructors
            //convert it into string form
            modifier = constructor.getModifiers();
            mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            //get the number of parameters in constructors
            System.out.println("Parameters: " + constructor.getParameterCount());
            System.out.println("---------------------------------------------");
        }
        //Runnable
        System.out.println("");
        System.out.println("Thread and Runnable:");
        System.out.println("---------------------------------------------");


        Thread unit1 = new Thread(new ThreadRunnable("Unit 1 "));
        Thread unit2 = new Thread(new ThreadRunnable("Unit 2 "));
        Thread unit3 = new Thread(new ThreadRunnable("Unit 3 "));

        unit1.start();
        unit2.start();
        unit3.start();

        //Thread
        Thread unit4 = new Thread(new ThreadRunnable("Unit 4 "));
        Thread unit5 = new Thread(new ThreadRunnable("Unit 5 "));
        Thread unit6 = new Thread(new ThreadRunnable("Unit 6 "));

        unit4.start();
        unit5.start();
        unit6.start();


        //Connection Pools
                ConnectionPool connectionPool = ConnectionPool.getInstance(MAX_POOL_SIZE);
                ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
                List<CompletableFuture<Connection>> threads = new ArrayList<>();

        for (int i=0; i<7; i++){
            CompletableFuture<Connection> thread = CompletableFuture.supplyAsync(connectionPool::getConnection, executor);
            threads.add(thread);
        }
        System.out.println("");
        System.out.println("Connection Pools:");
        System.out.println("---------------------------------------------");



        CompletableFuture.allOf(threads.toArray(new CompletableFuture[0])).join();

        threads.forEach(item -> {
            try {
                System.out.println("Connection: " + item.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });


    }
}





