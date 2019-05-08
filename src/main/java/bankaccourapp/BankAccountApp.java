package bankaccourapp;


import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();



        String file = "/home/amir/udemycourse/src/main/resources/my.csv";

//      Checking checking = new Checking();    for 1

//        Checking checking = new Checking("Tom Wilson ");
//        Saving saving = new Saving("Nahid Asadioun ");


//        Checking checking = new Checking("Tom Wilson ", "43754867",1500);
//        Saving saving = new Saving("Nahid Asadioun ","58799089",3600);
//
//
//        saving.compound();
//
//        checking.showInfo();
//        System.out.println(" ___________________");
//        saving.showInfo();

//        saving.deposit(5000);
//        saving.withdraw(300);
//        saving.transfer("brok" , 3000);

        //read a CSV file then create new account based on that data

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
//            System.out.println(accountHolder[0]);
//            System.out.println(accountHolder[1]);
//            System.out.println(accountHolder[2]);
//            System.out.println(accountHolder[3]);

            String name = accountHolder[0];
            String socialSecurityNum = accountHolder[1];
            String accountType = accountHolder[2];
            double intDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + socialSecurityNum + " " + accountType + "  $"+ intDeposit);

            if (accountType.equals("saving")){
//                System.out.println("Open saving account");
                accounts.add(new Saving(name,socialSecurityNum,intDeposit));
            }
            else if (accountType.equals("checking")){
//                System.out.println("open checking account");
                accounts.add(new Checking(name,socialSecurityNum,intDeposit));

            }else {
                System.out.println(" ERROR reading account type");
            }
        }
//        accounts.get(5).showInfo();
        for (Account account : accounts){
            System.out.println("\n *********************");
            account.showInfo();
        }

//        accounts.get((int) Math.random() * accounts.size()).deposit(10000);
//        accounts.get((int) Math.random() * accounts.size()).deposit(1500);

    }
}
