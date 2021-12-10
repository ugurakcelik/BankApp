package BankApp;
public class creditCard {
private double limit = 500;
private final int cardNumber;
private static int defaultCardNumber=100000;
public creditCard(){
defaultCardNumber++;
cardNumber=defaultCardNumber;
limit=500;
}

    public boolean debt(double amount){
if(balanceCheck(amount)){ 
this.limit-=amount;
return true;
}
else{
    return false;
}    
}
    public int getCardNumber() {
        return cardNumber;
    }
    public boolean balanceCheck(double amount){
if(this.limit>=amount){
    return true;
}
else{
    return false;
}
}
    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
