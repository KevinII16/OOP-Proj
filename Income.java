public class Income extends Budget{ //income subclass inheriting from the budget superclass
    private String job;
    private double hourly_rate;
    private double salary;
    private double weekly_hours;
    private double weeks_per_month;

    public Income(String job, double hourly_rate, double weekly_hours, double weeks_per_month,String name, double total_amount, String continent){ 
        super(name,total_amount,continent); //calling the superclass constructor
        this.job = job;
        this.hourly_rate = hourly_rate;
        this.weekly_hours = weekly_hours;
        this.weeks_per_month = weeks_per_month;
        this.salary = hourly_rate * weekly_hours * weeks_per_month;
    }
    public Income(){
        super();
        this.job = "";
        this.hourly_rate = 0.0;
        this.weekly_hours = 0.0;
        this.weeks_per_month = 0.0;
        this.salary = 0.0;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    public double getHourly_rate(){
        return hourly_rate;
    }
    public void setHourly_rate(double hourly_rate){
        this.hourly_rate = hourly_rate;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){ //just regular get and set methods for all the varoables
        this.salary = salary;
    }
    public double getWeekly_hours(){
        return weekly_hours;
    }
    public void setWeekly_hours(double weekly_hours){
        this.weekly_hours = weekly_hours;
    }
    public double getWeeks_per_month(){
        return weeks_per_month;
    }
    public void setWeeks_per_month(double weeks_per_month){
        this.weeks_per_month = weeks_per_month;
    }
}

