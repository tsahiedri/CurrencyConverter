import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        Function f = new Function();
        Object[] currencyOptions = {"ILS", "GBP", "Quit"};
        Object[] nevigateOptions = {"Try Again", "Quit"};


        while(true) {
            String input = JOptionPane.showInputDialog(null,
                    "Enter amount of dollars to convert: ",
                    "Dollars Converter", JOptionPane.PLAIN_MESSAGE);

            if(f.inputIsValid(input)){
                double amountToConvert = Double.parseDouble(input);
                int currencyChosen = JOptionPane.showOptionDialog(null,
                        "Choose currency to convert to: ",
                        "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, currencyOptions, currencyOptions[2]);
                switch (currencyChosen){
                    // ILS Chosen
                    case 0 -> f.dollarToILS(amountToConvert);
                    // GBP Chosen
                    case 1 -> f.dollarToGBP(amountToConvert);
                }
            } else{
                JOptionPane.showMessageDialog(null, "Invalid input");
            }

            int nevigateChosen = JOptionPane.showOptionDialog(null,
                    "What do you wish to do?", "Currency Converter",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, nevigateOptions, nevigateOptions[1]);
            // Quit Chosen
            if(nevigateChosen == 1){
                break;
            }

        }

    }

}
