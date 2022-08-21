import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function f = new Function();
        Object[] option1 = {"ILS", "GBP", "Quit"};
        Object[] option2 = {"Try Again", "Quit"};


        while(true) {
            String input = JOptionPane.showInputDialog(null, "Enter amount of dollars to convert: ");
            System.out.println(input);

            if(f.inputIsValid(input)){
                double amountToConvert = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null,
                        "Choose currency to convert to: ",
                        "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        option1,
                        option1[2]);
                switch (choice1){
                    case 0 -> {
                        f.dollarToILS(amountToConvert);
                        int choice2 = JOptionPane.showOptionDialog(null,
                                "What do you wish to do?"
                                , "Currency Converter",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null, option2, option2[1]);
                        if(choice2 == 0){
                            continue;
                        }
                    }
                    case 1 -> {
                        f.dollarToGBP(amountToConvert);
                        int choice2 = JOptionPane.showOptionDialog(null,
                                "What do you wish to do?"
                                , "Currency Converter",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null, option2, option2[1]);
                        if(choice2 == 0){
                            continue;
                        }
                    }
                }
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                int choice2 = JOptionPane.showOptionDialog(null,
                        "What do you wish to do?"
                            , "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, option2, option2[1]);
                if(choice2 == 0){
                    continue;   
                } else{break; }
            }
        }

    }

}
