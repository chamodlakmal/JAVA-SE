
package part52;

public class Engineer extends People{

    public Engineer(String name, double cash) {
        super(name, cash);
    }

    @Override
    double getIncome() {
        return super.getCash()*30;
    }

    @Override
    String getDetails() {
        
        return "Hi , "+super.getName()+" your income is : "+getIncome();
    
       
    }
    
}
