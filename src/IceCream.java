/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class IceCream extends DessertItem {

    private int cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
        
    }

  
    public String toString()
    {
     String s = "";
     s += super.getName();
     String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (cost.length() + super.getName().length()); i++){
            s += " ";
        }
        s += cost;
        return s;
       
    }

    @Override
    public int getCost() {
        return this.cost;
    }
    
}
