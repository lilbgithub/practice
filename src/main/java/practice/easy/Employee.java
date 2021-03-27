package practice.easy;

public class Employee {
    private String name;
    private Double salary;
    private String department;

    public Employee(String name, Double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return name+" "+department+" "+salary.toString();
    }
}
