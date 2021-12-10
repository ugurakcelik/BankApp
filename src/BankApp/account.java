package BankApp;
public class account{
creditCard creditCard;
private final int accnumber,iban;
private double balance;
private final double minBalanceLimit=0;
private static int defaultAccNum=1000,defaultIbanNum=350000;
public account(){
defaultAccNum++;
accnumber=defaultAccNum;
defaultIbanNum++;
iban=defaultIbanNum;
}
    public boolean eft(double amount){
if(amount>=0 && balanceCheck(amount)){
balance-=amount;
return true;
}
else{
    return false;
}
}
    public boolean balanceCheck(double amount){
if(this.balance-amount>=minBalanceLimit){
    return true;
}
else{
    return false;
}
}
    public void addBalance(double amount){
        this.balance+=amount;
    }
    public void setBalance(double balance) {
        this.balance += balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccNumber() {
        return accnumber;
    }
    public int getIban() {
        return iban;
    }
}
