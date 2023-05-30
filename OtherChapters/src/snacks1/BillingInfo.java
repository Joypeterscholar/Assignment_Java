package snacks1;


public class BillingInfo {
    private String recieversPhoneNum;
    private String deliveryAddress;
    private String recieversName;
    private CreditCardInfo creditCardInfo;
    public BillingInfo(String recieversName, String recieversPhoneNum, CreditCardInfo creditCardInfo, String deliveryAddress){
        this.recieversName = recieversName;
        this.recieversPhoneNum = recieversPhoneNum;
        this.creditCardInfo = creditCardInfo;
        this.deliveryAddress = deliveryAddress;
    }
}
