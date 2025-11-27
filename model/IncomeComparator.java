/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import sustainableeducationapp.SustainableEducationApp;
/*
* @author Rostyslav Kuznets
* Student number: 24326776
* Course: BSHCIFSC2
 */

/*
* this class compares user income to the different continents average incomes
* it also shows the percentage difference of users info to the continent
*/

public class IncomeComparator extends SustainableEducationApp {

    private String continent;
    private double avgIncome;
    private String fact;

    //constructor receives continent info and sends user income to the parent class
    public IncomeComparator(String continent, double avgIncome, String fact, double userIncome) {
        super(userIncome);
        this.continent = continent;
        this.avgIncome = avgIncome;
        this.fact = fact;
    }

    //compare users annual income to avg income
    public String compareIncome() {
        double annualUser = getUserIncome() * 12;
        double diff = ((annualUser - avgIncome) / avgIncome) * 100;

        double percent = Math.abs(Math.round(diff * 10.0) / 10.0);
        String comparison
                = "Your annual income: €" + Math.round(annualUser) + "\n"
                + "Average in " + continent + ": €" + Math.round(avgIncome) + "\n"
                + "You are " + percent + "% " + (diff >= 0 ? "higher" : "lower") + " than the average.";

        return comparison + "\nInteresting fact: " + fact;
    }

    //checks if close to the selected continent
    public String similarityComment(double userAnnual) {
        double diff = Math.abs(userAnnual - avgIncome);
        
        if (diff < 2000) {
            return "Interesting fact: your data is most similar to " + continent + ".";
        } else {
            return "Your data differs significantly from " + continent + ".";
        }
    }
}
