import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*List<String> countrynames = Arrays.asList("America","Canada","Ireland","Finland","India");
        Stream<String> countryname = countrynames.stream();
        Stream<String> longCountrynames = countryname.filter(str -> str.length() > 6);
        longCountrynames.forEach(str->System.out.print(str+" "));*/

     /*   MyThread myThread = new MyThread();
        myThread.start();

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread1 = new Thread(myThreadRunnable);
        thread1.start();*/

        Employee e1 = new Employee(101, Constants.AMEX, 31, 220000, "Technical");
        Employee e2 = new Employee(102, "Tiya", 23, 180000, "IT");
        Employee e3 = new Employee(103, "Advait", 31, 220000, "IT");
        Employee e4 = new Employee(104, "Akash", 61, 290000, "HR");
        Employee e5 = new Employee(105, "ALISHA", 15, 340000, "HR");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("Employee with Department HR Names : \n");
        list.stream().filter(employee -> employee.getDepratment().equals("HR")).map(Employee::getEmpName).forEach(System.out::println);

        System.out.println("----------------");

        List<Employee> filtered = list.stream().filter
                (employeeList -> employeeList.empAge >20 && employeeList.depratment.equals("HR")).collect(Collectors.toList());
            System.out.println(filtered);
        System.out.println("----------------");

        list.stream().filter
                (employeeList -> employeeList.empAge >20 && employeeList.depratment.equals("HR")).
                map(Employee::getEmpName).
                forEach(System.out::println);

        System.out.println("----------------");


            Map<String, Long> map =
                    list.stream().collect(Collectors.groupingBy(Employee::getDepratment,Collectors.counting()));
        System.out.println(map);

        



    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread  " + MyThread.currentThread().getName() +"running");
    }
}

class MyThreadRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread runnable  " + MyThreadRunnable.class.getName() +"running");
    }
}

class Employee{
    Integer empId;
    String empName;
    Integer empAge;
    Integer empSalary;
    String depratment;

    public Employee(Integer empId, String empName, Integer empAge, Integer empSalary, String depratment) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
        this.depratment = depratment;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }

    public String getDepratment() {
        return depratment;
    }

    public void setDepratment(String depratment) {
        this.depratment = depratment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSalary=" + empSalary +
                ", depratment='" + depratment + '\'' +
                '}';
    }
}