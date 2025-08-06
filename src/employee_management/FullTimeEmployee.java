package employee_management;

public class FullTimeEmployee {
    private int employeeId;
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        setMonthlySalary(monthlySalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
    if (monthlySalary < 0) {
        this.monthlySalary = 0;
    } else {
        this.monthlySalary = monthlySalary;
    }
}

    public double calculatePay() {
        return monthlySalary;
    }
}

