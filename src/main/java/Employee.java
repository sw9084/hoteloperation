public class Employee {
    private int employedId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // costructor
    public Employee(int employedId, String name, String department, double payRate, double hoursWorked ) {
        this.employedId = employedId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    // getter
    public int getEmployedId() {
        return employedId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    // derived getter: calculates regular hours
    public double getRegularHoursWorked() {
        return Math.min(hoursWorked,50);
    }
    // derived getter overtime hours
    public double getOvertimeHoursWorked() {
        return Math.min(hoursWorked - 40, 20);
    }
    // derived getter total pay
    public double getTotalPay() {
        double regularPay = getRegularHoursWorked() * payRate;
        double overtimePay = getOvertimeHoursWorked() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}
