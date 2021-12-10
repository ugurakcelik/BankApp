package BankApp;

public class user {
public account account[] = new account[5];
public creditCard creditCard[] = new creditCard[2];
private String name,surname,email,password;
private final int cusnum;
private int telnum;
private static int defaultCusNum=180000000;
public static int userCount=0;
public user(){
account[0]=new account();
creditCard[0]=new creditCard();
defaultCusNum++;
cusnum=defaultCusNum;
userCount++;
}
//For Admin login
public user(String name,String password){
this.name=name;
this.password=password;
cusnum=0;
}
public user(String name, String surname, String email) {
        account[0]=new account();
        creditCard[0]=new creditCard();
        this.name = name;
        this.surname = surname;
        this.email = email;
        defaultCusNum++;
        cusnum=defaultCusNum;
        userCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCusNum() {
        return cusnum;
    }

    public int getTelNum() {
        return telnum;
    }

    public void setTelNum(int telnum) {
        this.telnum = telnum;
    }
    public void showUsers(){
        System.out.println(this.name+" "+this.surname+" "+this.cusnum);
    } 
    }

