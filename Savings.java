/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;


/**
 *
 * @author kevinalabi
 */



public class Savings extends Budget {

    private double goal;             // how much they want to save
    private double existingSavings;  // how much they already have
    private int months;              // number of months
    private double[] monthlySaving;  // saving plan array

    public Savings(double goal, double existingSavings, int months, String name, double total_amount, String continent) {
        super(name, total_amount, continent);
        this.goal = goal;
        this.existingSavings = existingSavings;
        this.months = months;
        this.monthlySaving = new double[months];  // create the array
    }

    public Savings() {
        super();
        this.goal = 0;
        this.existingSavings = 0;
        this.months = 0;
        this.monthlySaving = null;
    }

    public double getGoal() {
        return goal;
    }

    public double getExistingSavings() {
        return existingSavings;
    }

    public int getMonths() {
        return months;
    }

    public double[] getMonthlySaving() {
        return monthlySaving;
    }

    // Very simple calculation
    public double calculateMonthlyAmount() {
        double remaining = goal - existingSavings;

        if (months > 0) {
            return remaining / months;
        }

        return 0;
    }

    // Fill the array
    public void fillMonthlySavingArray() {
        double monthlyAmount = calculateMonthlyAmount();

        for (int i = 0; i < months; i++) {
            monthlySaving[i] = monthlyAmount;
        }
    }
}

