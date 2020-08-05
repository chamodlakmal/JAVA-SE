/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author chamo
 */
public class Engineer extends People {

    public Engineer(String name, double cash) {
        super(name, cash);
    }

    @Override
    public double getIncome() {
        return super.getCash()*30;
    }
    
}
