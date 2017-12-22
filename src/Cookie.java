/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {

    private int numb;
    private int price12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.numb = number;
        this.price12 = pricePer12;
    }

    @Override
    public String toString() {
        String s = "";
        String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        s += this.numb + " @ $" + DessertShoppe.cents2dollarsAndCents(this.price12) + " /dz";
        s += "\n" + super.getName();
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (cost.length() + super.getName().length()); i++) {
            s += " ";
        }
        s += cost;
        return s;
    }

    public int getCost() {
        double rate = (price12 / 12) * numb;
        Math.round(rate);
        return (int) rate;
    }
}
