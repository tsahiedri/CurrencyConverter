import javax.swing.*;

public class Function {

    public boolean inputIsValid(String input) {
        try{
            double x = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void dollarToILS(double amountToConvert){
        double ILS = amountToConvert * 3.28;
        JOptionPane.showMessageDialog(null, "Amount of ILS: " + ILS + "₪");
    }
    public void dollarToGBP(double amountToConvert){
        double GBP = amountToConvert * 0.85;
        JOptionPane.showMessageDialog(null, "Amount of GBP: " + GBP + "£");
    }
}
