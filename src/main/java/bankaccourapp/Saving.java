package bankaccourapp;

public class Saving extends Account implements IBaseRate{
    // List properties specific to the saving account
   private int safetyDepositBoxId;
    private int safetyDepositBoxKey;


    //Constructor to initialize setting for the saving properties
//
//    public Saving(String name){
//        super(name);
//        System.out.println("new saving account");
//        System.out.println(name);
//    }

    public Saving(String name, String socialSecurityNum, double initDeposit){
        super(name,socialSecurityNum,initDeposit);
        accountNumber = "1" + accountNumber;
//        System.out.println("account number : " + this.accountNumber);
//        System.out.println("new saving account");
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
//        System.out.println("impliment rate saving");
        rate = getBaseRate() - .25;
    }


    // safety deposit box 3 digital
    public void setSafetyDepositBox(){
        // 3 digital
        safetyDepositBoxId = (int)(Math.random()* Math.pow(10,3));
        System.out.println(safetyDepositBoxId);
        // 4 digital
        safetyDepositBoxKey = (int)(Math.random()* Math.pow(10,4));
    }



    // List any method specific to saving account

    public void showInfo(){

//        System.out.println("type : Saving");
        super.showInfo();
//        System.out.println("type : Saving");
        System.out.println("your saving account feature" + "\n safety deposit id: "+ safetyDepositBoxId+"\n safety deposit key"
        +safetyDepositBoxKey);
    }

    @Override
    public double getBaseRate() {
        return 2.5;
    }
}
