public class Cards {
    private final String cardNumber;
    private final String cardUser;
    // Card Holder is the name of the person
    private String cardHolder;
    private final String cardCVV;
    private String cardPin;
    private double cardBalance = 0;

     // Card Constructor
    public Cards(String inputCardNumber,
                String inputCardUser,
                String inputCardHolder,
                String inputCardCVV,
                String inputCardPin) {
        this.cardNumber = inputCardNumber;
        this.cardUser = inputCardUser;
        this.cardHolder = inputCardHolder;
        this.cardCVV = inputCardCVV;
        this.cardPin = inputCardPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardUser() {
        return cardUser;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }
}
