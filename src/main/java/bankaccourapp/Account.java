package bankaccourapp;

public abstract class Account implements IBaseRate{
    // list common properties for savings and checking accounts

    private String name;
    private String socialSecurityNum;
    private double balance;
    protected String accountNumber;
    protected double rate;
    //unique 5 digit number
    private static int index = 10000;


    // Constructor to set base properties an initialize the account
//    public Account(){
//        System.out.println("New account");
//    }

//    public Account(String name){
//        System.out.println("New account");
//        System.out.print("name :" + name);
//    }

    public Account(String name, String socialSecurityNum,double initDeposit){
//        System.out.println("New account");
//        System.out.print("name :" + name);
        this.name = name;
        this.socialSecurityNum = socialSecurityNum;
        balance = initDeposit + 100;
//        System.out.println("Name: "+ name +"socialSecurityNumber: "+ socialSecurityNum + "Balance:" + balance);


        //set account number
        index ++;
        this.accountNumber = setAccountNumber();
//        System.out.println("Account number:" + this.accountNumber);
//        System.out.println(getBaseRate());
        setRate();
    }

    public abstract void setRate();




    //11 digital Number
     private String setAccountNumber(){

         // 2 ragham akhre soical number ra mikhanad
         String lastTwoOfSsn = socialSecurityNum.substring(socialSecurityNum.length()-2,socialSecurityNum.length());
         //unique digital
         int uniqueId = index;
         // random 3 digital number
         int randomNumber = (int)(Math.random() * Math.pow(10,3));
         return lastTwoOfSsn + uniqueId + randomNumber;

     }

    public void compound(){
        double accrueInterest = balance * (rate/100);
        balance = balance + accrueInterest;
        System.out.println("accrute " + accountNumber);
        printBalence();
    }
    // List common method

    public void showInfo(){
        System.out.println("Name: " + name + "\nAccount Number: " + accountNumber +
        "\nBalence: "+ balance +  "\n rate "+ rate + "%");
    }

    public void deposit(double amount){
        balance = balance +amount;
        System.out.println("deposit" +amount);
        printBalence();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("withdraw"+ amount);
        printBalence();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("transfer "+ amount + " to " + toWhere);
        printBalence();
    }
    public void printBalence(){
        System.out.println("your balence now " + balance);
    }
}
