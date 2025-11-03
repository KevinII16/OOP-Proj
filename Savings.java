public class Savings extends Budget { // Savings subclass inheriting from the Budget superclass
    private double savings;
    private double [] monthly_saving;
    private double savings_account;
    private int months;

    public Savings(double [] monthly_saving, double savings_account, int months, String name, double total_amount, String continent,double savings){
        super(name,total_amount,continent); //calling the superclass constructor
        this.monthly_saving = monthly_saving;
        this.savings_account = savings_account;
        this.months = months;
        this.savings = savings;
    }

    public Savings(){
        super();
        this.monthly_saving = new double[12]; // assuming 12 months of savings
        this.savings_account = 0.0;
        this.months = 0;
        this.savings = 0.0;
    }

    public double[] getMonthlySaving(){
        return monthly_saving;
    }

    public void setMonthlySaving(double[] monthly_saving){ // regular get and set methods for all the variables
        this.monthly_saving = monthly_saving;   
    }

    public double getSavingsAccount(){
        return savings_account;
    }

    public void setSavingsAccount(double savings_account){
        this.savings_account = savings_account;
    }

    public int getMonths(){
        return months;
    }

    public void setMonths(int months){
        this.months = months;
    }
    public double getSavings(){
        return savings;
    }
    public void setSavings(double savings){
        this.savings = savings;
    }
}
