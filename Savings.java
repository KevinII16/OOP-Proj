public class Savings extends Budget {
    private double monthly_saving;
    private double savings_account;
    private int months;

    public Savings(double monthly_saving, double savings_account, int months, String name, double total_amount, String continent){
        super(name,total_amount,continent);
        this.monthly_saving = monthly_saving;
        this.savings_account = savings_account;
        this.months = months;
    }

    public Savings(){
        super();
        this.monthly_saving = 0.0;
        this.savings_account = 0.0;
        this.months = 0;
    }

    public double getMonthlySaving(){
        return monthly_saving;
    }

    public void setMonthlySaving(double monthly_saving){
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
}
