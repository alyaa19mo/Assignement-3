/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement32;

/**
 *
 * @author USER
 */
public class Mammal implements animal {

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void travel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int noOfLegs(int legs)
    { 
        return legs;
    }
    public String food(String fdd)
    { 
    return fdd;
    }
}
