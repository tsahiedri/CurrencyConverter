import javax.swing.*;

public class Function {
    public void dollarToILS(double input){
        double ILS = input * 3.28;
        JOptionPane.showConfirmDialog(null, "Amount of ILS: " + ILS + "₪");
    }
    public void dollarToGBP(double input){
        double GBP = input * 0.85;
        JOptionPane.showConfirmDialog(null, "Amount of GBP: " + GBP + "£");
    }
}
