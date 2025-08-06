package employee_management;

public class PartTimeEmployee implements Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            this.hoursWorked = 0;
        } else {
            this.hoursWorked = hoursWorked;
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            this.hourlyRate = 0;
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
