import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function f = new Function();

        double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value: "));
        System.out.println(input);

        f.dollarToILS(input);
        f.dollarToGBP(input);
    }

}
