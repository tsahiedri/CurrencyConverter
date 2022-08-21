import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function f = new Function();



        while(true) {
            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            if(f.inputIsValid(input)){
                double amountToConvert = Double.parseDouble(input);
                f.dollarToILS(amountToConvert);
                f.dollarToGBP(amountToConvert);
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            }
        }

    }

}
