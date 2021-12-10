package BankApp;

import java.util.Scanner;
public class MainPanel {
public static Scanner sc = new Scanner(System.in);
public static int userSelection=0,accountCounter=1,creditCardCounter=1,userSelectionEft=0;
public static void main(String[] args) {
boolean menu=true;
user [] userList = new user[100];
user admin = new user("admin","admin");
userList[0] = new user("Ugur","Akcelik","ugurakcelik10@gmail.com");
login(admin);
System.out.println("Choose user:");
for(int i=0;i<user.userCount;i++){
    System.out.print(i+" for ");
    userList[i].showUsers();
}
userSelection=sc.nextInt();
while(menu){
        System.out.print("Choose action:\n"
                        +"1 for adding Account\n"
                        +"2 for adding Credit Card\n"
                        +"3 for money Transfer\n"
                        +"4 for debt for Credit Card\n"
                        +"0 for exit\n");
        int operation=sc.nextInt();
switch(operation){
    case 0:{
        menu=false;
        break;
    }
    case 1:{
   if(accountCounter<5){
   userList[userSelection].account[accountCounter]=new account();
       System.out.println("Account created!");
       accountCounter++;
   }
   else{
       System.out.println("You have reached maximum account limit(5/5)");
   }
   break;
   }
   case 2:{
   if(creditCardCounter<2){
   userList[userSelection].creditCard[creditCardCounter]=new creditCard();
       System.out.println("Credit Card created!");
   creditCardCounter++;
   }
   else{
       System.out.println("You have reached maximum credit card limit(2/2)");
   }
   break;
    }
   case 3:{
       System.out.println("Sender account:");
       showAccounts(userList);
       int from = sc.nextInt();
       System.out.println("Choose receiver user:");
for(int i=0;i<user.userCount;i++){
    System.out.print(i+" for ");
    userList[i].showUsers();
}
userSelectionEft=sc.nextInt();
       System.out.println("Receiver account:");
       showAccountsEft(userList);
       int to = sc.nextInt();
       System.out.println("Enter Amount:");
       double amount =sc.nextDouble();
       if(userList[userSelection].account[from].eft(amount)){
       userList[userSelectionEft].account[to].addBalance(amount);
       }
       else{
           System.out.println("You do not have enough balance for this payment");
       }
       break;
       }
   case 4:{
       System.out.println("Select Credit Card: ");
       showCreditCards(userList);
       int from = sc.nextInt();
       System.out.println("Receiver account:");
       showAccounts(userList);
       int to = sc.nextInt();
       System.out.println("Your limit: "+userList[userSelection].creditCard[from].getLimit()+" Enter amount:");
       double amount =sc.nextDouble();
       if(userList[userSelection].creditCard[from].debt(amount)){
       userList[userSelection].account[to].addBalance(amount);
       }
       else{
           
       }
       break;
   }
}    
}
}
public static void login(user admin){
    boolean loginStatus=false;
    while(loginStatus==false){
    System.out.print("name:");
    String name =sc.nextLine();
    System.out.print("password:");
    String pw =sc.nextLine();
        if(name.equals(admin.getName()) && (pw.equals(admin.getPassword()))){
            System.out.println("Welcome");
            loginStatus=true;
        }
        else{
            System.out.println("Wrong");
        }   
        }
}
public static void showAccounts(user userList[]){
for(int i=0;i<accountCounter;i++){
    System.out.println(i+" for Account: "+userList[userSelection].account[i].getAccNumber()+" Balance: "+userList[userSelection].account[i].getBalance());
       }
}
public static void showAccountsEft(user userList[]){
for(int i=0;i<accountCounter;i++){
    System.out.println(i+" for Account: "+userList[userSelectionEft].account[i].getAccNumber()+" Balance: "+userList[userSelectionEft].account[i].getBalance());
       }
}
public static void showCreditCards(user userList[]){
    for(int i=0;i<creditCardCounter;i++){
        System.out.println(i+" for Credit Card" +userList[userSelection].creditCard[i].getCardNumber()+" limit: "+userList[userSelection].creditCard[i].getLimit());
    }
}
}