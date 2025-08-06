package employee_management;

public class PartTimeEmployee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        if (hoursWorked < 0) {
            this.hoursWorked = 0;
        } else {
            this.hoursWorked = hoursWorked;
        }
        if(hourlyRate < 0) {
            this.hourlyRate = 0;
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

