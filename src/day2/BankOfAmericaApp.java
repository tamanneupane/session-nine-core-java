package day2;

import day2.BankAccount;

/**
 * This application is used by Bank of America
 *
 * @author Taman Neupane
 * @version 1.0.0
 */
public class BankOfAmericaApp {

    public static void main(String[] args) {

        BankAccount tamanAccount = new BankAccount();

//        tamanAccount.setAccountNumber();
        tamanAccount.setAccountHolderName("Taman Neupane");
        tamanAccount.setAccountType(AccountType.SAVING);
        tamanAccount.setConnectedMobileNumber("9851184633");
        tamanAccount.setAddress("Kathmandu, Nepal");
        tamanAccount.setBsbNumber("001");
        tamanAccount.setAccountBalance(500.0);
        tamanAccount.setSocialSecurityNumber("987654321");


//        System.out.println(tamanAccount.getAccountNumber());
//        System.out.println(tamanAccount.getAccountHolderName());
        System.out.println(tamanAccount.getAccountType());

//        System.out.println(tamanAccount.getConnectedMobileNumber());
//        System.out.println(tamanAccount.getAddress());
//        System.out.println(tamanAccount.getBsbNumber());
//        System.out.println(tamanAccount.getAccountBalance());
//        System.out.println(tamanAccount.getSocialSecurityNumber());


        BankAccount friendAccount = new BankAccount();

        friendAccount.setAccountHolderName("Taman Neupane");
        friendAccount.setAccountType(AccountType.SAVING);
        friendAccount.setConnectedMobileNumber("9851184633");
        friendAccount.setAddress("Kathmandu, Nepal");
        friendAccount.setBsbNumber("001");
        friendAccount.setAccountBalance(200.0);
        friendAccount.setSocialSecurityNumber("987654321");

        System.out.println(friendAccount.getAccountType());


        System.out.println("=============== Before Transaction =========");

        System.out.println(tamanAccount.getAccountBalance());
        System.out.println(friendAccount.getAccountBalance());

        //Transfer 300 from taman account to friend account

//        double tamanFinalBalance = tamanAccount.getAccountBalance() - 300;
//        double friendFinalBalance = friendAccount.getAccountBalance() + 300;
//
//        tamanAccount.setAccountBalance(tamanFinalBalance);
//        friendAccount.setAccountBalance(friendFinalBalance);

        BankAccount dummyAccount = new BankAccount();
        dummyAccount.transferBalance(tamanAccount, friendAccount, 300);


        System.out.println("=============== After Transaction =========");

        System.out.println(tamanAccount.getAccountBalance());
        System.out.println(friendAccount.getAccountBalance());
    }


}
