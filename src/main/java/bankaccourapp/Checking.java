package bankaccourapp;

public class Checking extends Account implements IBaseRate{

    // list properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPIN;


    // Constructor to initialize checking account properties

    // 1 instance
//    public Checking(){
//        System.out.println("new checking account");
//    }

//        public Checking(String name){
//
//        super(name);
//        System.out.println("new checking account");
//        System.out.println("Name: "+ name);
//    }

    public Checking(String name,String socialSecurityNum, double initDeposit){

        super(name,socialSecurityNum,initDeposit);
        accountNumber = "2" + accountNumber;
//        System.out.println("account number : " + this.accountNumber);
//        System.out.println("new checking account");
//        System.out.println("Name: "+ name);
        setGetDebitCard();
    }


    //List any method specific to the checking account

    private void setGetDebitCard(){
        // 4 digital
       debitCardPIN = (int)(Math.random() * Math.pow(10 ,4));
        // 12 digital
       debitCardNumber = (int)(Math.random() * Math.pow(10 ,12));

        System.out.println("card "+ this.debitCardNumber);
        System.out.println("PIN " + this.debitCardPIN);


    }

    @Override
    public void setRate(){
//        System.out.println("impliment rate checking");

       rate = getBaseRate() * .15;
    }


    public void showInfo(){
        super.showInfo();
//        System.out.println("Type : checking");
        System.out.println(" account feature: "+ "\n debit number "+ debitCardNumber
        + "\n debit key " + debitCardPIN);
    }

    @Override
    public double getBaseRate() {
        return 2.5;
    }
}
