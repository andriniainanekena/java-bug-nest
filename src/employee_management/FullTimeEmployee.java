package employee_management;

public class FullTimeEmployee implements Employee {
    private int employeeId;
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        setMonthlySalary(monthlySalary);
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
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

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
