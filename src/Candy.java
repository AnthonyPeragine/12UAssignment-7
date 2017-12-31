/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Candy extends DessertItem {

    //required instance variables
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        //creates the candy
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString() {
        //formats the string with the correct amount of spaces 
        String s = "";
        s += this.weight + " lbs.";
        s += " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb.";
        s += "\n" + super.getName();
        String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (cost.length() + super.getName().length()); i++){
            s += " ";
        }
        s += cost;
        return s;
    }

    @Override
    //gets the cost of the candy
    public int getCost() {
        
        double cost = this.weight * this.pricePerLbs;
        return (int)cost;
    }
}
