package entity.payment;

/**
 * NguyenVanDuong-20173069
 * */
public class DebitCard extends PaymentCard{
    private String issuingBank;
    private String cardNumber;
    private String owner;
    private String validFromDate;

    public DebitCard(String issuingBank, String cardNumber, String owner, String validFromDate){
        this.issuingBank = issuingBank;
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.validFromDate = validFromDate;
    }
}