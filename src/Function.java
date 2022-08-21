import javax.swing.*;

public class Function {
    private final static Object[] currencyOptions = {"USD", "ILS", "EUR", "GPB", "JPY", "Quit"};
    private final static Object[] nevigateOptions = {"Try Again", "Quit"};
    Currency sourceCurrency;
    Currency targetCurrency;
    String inputAmount;

    public void selectSourceCurrency(){
        int selectedSource  = JOptionPane.showOptionDialog(null,
                "Choose currency you wish to convert: ",
                "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, currencyOptions, currencyOptions[5]);
        this.sourceCurrency = createCurrency(selectedSource);
    }

    public double getInput(){
        return Double.parseDouble(this.inputAmount);
    }

    public void selectTargetCurrency(){
        int selectedTarget = JOptionPane.showOptionDialog(null,
                "Choose currency to convert to: ",
                sourceCurrency.getNickname() + " Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, currencyOptions, currencyOptions[5]);
        this.targetCurrency = createCurrency(selectedTarget);
    }

    public void getAmount(){
        this.inputAmount = JOptionPane.showInputDialog(null,
                "Enter amount of " + sourceCurrency.getNickname() + " to convert: ",
                sourceCurrency.getNickname() + " Converter", JOptionPane.PLAIN_MESSAGE);
    }

    public boolean inputIsValid() {
        try{
            double x = Double.parseDouble(this.inputAmount);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void convert(double amountToConvert){
        double sourceInDollars = sourceCurrency.convertToDollar(amountToConvert);
        double convertedAmount = targetCurrency.convertFromDollar(sourceInDollars);
        JOptionPane.showMessageDialog(null,"" + amountToConvert + "" + sourceCurrency.getSymbol()
                + " Worth "  + convertedAmount + "" + targetCurrency.getSymbol());
    }

    public boolean doneConverting(){
        int nevigateChosen = JOptionPane.showOptionDialog(null,
                "What do you wish to do?", "Currency Converter",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, nevigateOptions, nevigateOptions[1]);
        return nevigateChosen == 1;
    }

    public static Currency createCurrency(int currencyChosen){
        return switch (currencyChosen) {
            case 0 -> new Dollar();
            case 1 -> new IsraeliShekel();
            case 2 -> new Euro();
            case 3 -> new Pound();
            case 4 -> new JapaneseYen();
            default -> null;
        };
    }

}
