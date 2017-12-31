/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends IceCream {

    //required instance variables
    private int topCost;
    private String topName;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //creates the sundae using the name and cost from the ice cream class
        super(icName, icCost + toppingCost);
        this.topName = toppingName;
    }

    @Override
    public String toString() {
        //formats the string with the correct amount of spaces
        String s = "";
        s += topName + " Sundae with\n";
        s += super.getName();
        String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (cost.length() + super.getName().length()); i++) {
            s += " ";
        }
        s += cost;
        return s;
    }
}
