/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author kevinalabi
 */


public class Expenses extends Budget {

    private double rent;
    private double food;
    private double utilities;
    private double miscellaneous;

    public Expenses(double rent, double food, double utilities, double miscellaneous, String name, double total_amount, String continent) {
        super(name, total_amount, continent);
        this.rent = rent;
        this.food = food;
        this.utilities = utilities;
        this.miscellaneous = miscellaneous;
    }

    public Expenses() {
        super();
        rent = 0.0;
        food = 0.0;
        utilities = 0.0;
        miscellaneous = 0.0;
    }

    public double getRent() { return rent; }
    public void setRent(double rent) { this.rent = rent; }

    public double getFood() { return food; }
    public void setFood(double food) { this.food = food; }

    public double getUtilities() { return utilities; }
    public void setUtilities(double utilities) { this.utilities = utilities; }

    public double getMiscellaneous() { return miscellaneous; }
    public void setMiscellaneous(double miscellaneous) { this.miscellaneous = miscellaneous; }

    // compute
    public double computeExpenses() {
        return rent + food + utilities + miscellaneous;
    }
}
