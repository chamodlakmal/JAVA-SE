package part52;

abstract class People {

    private String name;
    private double cash;
    
    
    
    People(String name,double cash){
        this.cash=cash;
        this.name=name;
    }

    abstract double getIncome();
    abstract String getDetails();

    
    public String getName() {
        return name;
    }    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getCash() {
        return cash;
    }

    
    public void setCash(double cash) {
        this.cash = cash;
    }
    
    
}
