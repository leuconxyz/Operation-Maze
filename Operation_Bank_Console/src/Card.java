/*
To be added later when or if I make this more in depth...
This is just the base of what it can have, haven't looked at it much.
 */

public class Card {
    private final String cardNumber;
    private final String cardUserId;
    private String cardHolder; // Cardholder is the name of the person
    private final String cardCVV;
    private String cardPin;
    private double cardBalance = 0;

     // Card Constructor
    public Card(String inputCardNumber,
                String inputCardUser,
                String inputCardHolder,
                String inputCardCVV,
                String inputCardPin) {
        this.cardNumber = inputCardNumber;
        this.cardUserId = inputCardUser;
        this.cardHolder = inputCardHolder;
        this.cardCVV = inputCardCVV;
        this.cardPin = inputCardPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardUser() {
        return cardUserId;
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
