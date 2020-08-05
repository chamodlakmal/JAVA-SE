
package example;

public abstract class People {
    private String name;
    private double cash; 
    
    People(String name,double cash){
        this.cash=cash;
        this.name=name;
    }
    
    
    public abstract double getIncome();

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        this.cash = cash;
    }
    
    
    
    
}
