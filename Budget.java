/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author kevinalabi
 */
public class Income extends Budget {   // Income subclass inheriting from Budget

    private String job;
    private double hourly_rate;
    private double salary;            // final monthly income
    private double weekly_hours;
    private double weeks_per_month;

    // Constructor for hourly workers
    public Income(String job, double hourly_rate, double weekly_hours, double weeks_per_month, String name, double total_amount, String continent) {

        super(name, total_amount, continent); // calling superclass

        this.job = job;
        this.hourly_rate = hourly_rate;
        this.weekly_hours = weekly_hours;
        this.weeks_per_month = weeks_per_month;

        // Calculate salary for hourly workers
        this.salary = hourly_rate * weekly_hours * weeks_per_month;
    }

    // constructor
    public Income() {
        super();
        this.job = "";
        this.hourly_rate = 0.0;
        this.weekly_hours = 0.0;
        this.weeks_per_month = 0.0;
        this.salary = 0.0;
    }

    //  GETTERS & SETTERS  

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public double getWeekly_hours() {
        return weekly_hours;
    }

    public void setWeekly_hours(double weekly_hours) {
        this.weekly_hours = weekly_hours;
    }

    public double getWeeks_per_month() {
        return weeks_per_month;
    }

    public void setWeeks_per_month(double weeks_per_month) {
        this.weeks_per_month = weeks_per_month;
    }

    public double getSalary() {
        return salary;
    }

    //  COMPUTE METHODS 

    // Used when user enters monthly salary directly
    public void setMonthlySalary(double salaryAmount) {
        this.salary = salaryAmount;
    }

    // Used for hourly workers
    public double computeIncome() {
        if (hourly_rate > 0 && weekly_hours > 0 && weeks_per_month > 0) {
            salary = hourly_rate * weekly_hours * weeks_per_month;
        }
        return salary;
    }
}

