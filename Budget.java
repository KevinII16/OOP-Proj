public class Budget {
    protected String name;
    protected double total_amount;
    protected String continent;

    public Budget(String name, double total_amount,String continent){
        this.name = name;
        this.total_amount = total_amount;
        this.continent = continent;
    }
    public Budget(){
        this.name = "";
        this.total_amount = 0.0;
        this.continent = "";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getTotal_amount(){
        return total_amount;
    }
    public void setTotal_amount(double total_amount){
        this.total_amount = total_amount;
    }
    public String getContinet(){
        return continent;
    }
    public void setContinet(String continent){
        this.continent = continent;
    }
}
