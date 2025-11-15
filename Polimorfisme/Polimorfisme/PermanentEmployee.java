package Polimorfisme;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }

    @Override
    public int getPaymentAmount() {
        return (int)(salary+0.05*salary);
    }
    
}
