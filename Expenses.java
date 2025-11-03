public class Expenses extends Budget { //expenses subclass inheriting from the budget superclass
    private double rent;
    private double food;
    private double utilities;
    private double miscellaneous;

    public Expenses(double rent, double food, double utilities, double miscellaneous, String name, double total_amount, String continent){
        super(name,total_amount,continent); //calling the superclass constructor
        this.rent = rent;
        this.food = food;
        this.utilities = utilities;
        this.miscellaneous = miscellaneous;
    }
    public Expenses(){
        super();
        this.rent = 0.0;
        this.food = 0.0;
        this.utilities = 0.0;
        this.miscellaneous = 0.0;
    }
    public double getRent(){
        return rent;
    }
    public void setRent(double rent){
        this.rent = rent;
    }
    public double getFood(){
        return food;
    }
    public void setFood(double food){ // more getters and setter for all variables
        this.food = food;
    }
    public double getUtilities(){
        return utilities;
    }
    public void setUtilities(double utilities){
        this.utilities = utilities;
    }
    public double getMiscellaneous(){
        return miscellaneous;
    }

    public void setMiscellaneous(double miscellaneous){
        this.miscellaneous = miscellaneous;
    }
}
