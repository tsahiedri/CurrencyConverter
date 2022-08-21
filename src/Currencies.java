abstract class Currency {
    protected String symbol;
    protected double rateToDollar;
    protected String nickname;

    double convertToDollar(double amount){
        return amount * rateToDollar;
    }

    double convertFromDollar(double amount){
        return amount / rateToDollar;
    }
    public String getNickname() {
        return nickname;
    }

    public String getSymbol(){
        return symbol;
    }
}

class Dollar extends Currency {
    public Dollar(){
        this.symbol = "$";
        this.rateToDollar = 1.0;
        this.nickname = "USD";
    }
}
class IsraeliShekel extends Currency {
    public IsraeliShekel(){
        this.symbol = "₪";
        this.rateToDollar = 0.31;
        this.nickname = "ILS";
    }
}

class Euro extends Currency {
    public Euro(){
        this.symbol = "€";
        this.rateToDollar = 1.0;
        this.nickname = "EUR";
    }
}

class Pound extends Currency {
    public Pound(){
        this.symbol = "£";
        this.rateToDollar = 1.18;
        this.nickname = "GBP";
    }
}

class JapaneseYen extends Currency {
    public JapaneseYen(){
        this.symbol = "¥";
        this.rateToDollar = 0.0073;
        this.nickname = "JPY";
    }
}
