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

    private int topCost;
    private String topName;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.topName = toppingName;
        this.topCost = toppingCost;
    }

    @Override
    public String toString() {
    }
}
