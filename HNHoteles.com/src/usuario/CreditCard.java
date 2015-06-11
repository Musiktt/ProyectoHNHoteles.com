/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

/**
 *
 * @author Stward
 */
public class CreditCard {
    private String cardType;
    private int cardNumber;
    private String securityCode;
    private String expirationDate;//mes y año

    public CreditCard() {
    }

    public CreditCard(String cardType, int cardNumber, String securityCode, String expirationDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "cardType=" + cardType + ", cardNumber=" + cardNumber + ", securityCode=" + securityCode + ", expirationDate=" + expirationDate + '}';
    }
    
    
}
