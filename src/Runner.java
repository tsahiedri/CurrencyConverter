import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        Function f = new Function();

        while(true) {

            f.selectSourceCurrency();

            f.getAmount();

            if(f.inputIsValid()){
                double amountToConvert = f.getInput();
                f.selectTargetCurrency();
                f.convert(amountToConvert);
            } else{
                JOptionPane.showMessageDialog(null, "Invalid input");
            }

            if(f.doneConverting()){
                break;
            }
        }
    }

}
