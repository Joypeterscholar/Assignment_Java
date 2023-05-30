package snacks1;

public class CreditCardInfo {
    private  String cardName;
    private int cardCvv;
    private int cardNo;
    private int cardYear;
    private String cardMonth;
    private CardType cardType;
    public CreditCardInfo(String cardName, int cardCvv, int cardNo, int cardYear, String cardMonth, CardType cardType){
        this.cardName = cardName;
        this.cardCvv = cardCvv;
        this.cardNo = cardNo;
        this.cardYear = cardYear;
        this.cardMonth = cardMonth;
        this.cardType = cardType;
    }


}
