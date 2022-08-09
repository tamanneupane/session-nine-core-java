package day2;

import day2.BankAccount;

public class BankOfAmericaApp {

    public static void main(String[] args) {

        BankAccount tamanAccount = new BankAccount();

//        tamanAccount.setAccountNumber();
        tamanAccount.setAccountHolderName("Taman Neupane");
        tamanAccount.setAccountType("Saving");
        tamanAccount.setConnectedMobileNumber("9851184633");
        tamanAccount.setAddress("Kathmandu, Nepal");
        tamanAccount.setBsbNumber("001");
        tamanAccount.setAccountBalance(50000.0);
        tamanAccount.setSocialSecurityNumber("987654321");


        System.out.println(tamanAccount.getAccountNumber());
        System.out.println(tamanAccount.getAccountHolderName());
        System.out.println(tamanAccount.getAccountType());
        System.out.println(tamanAccount.getConnectedMobileNumber());
        System.out.println(tamanAccount.getAddress());
        System.out.println(tamanAccount.getBsbNumber());
        System.out.println(tamanAccount.getAccountBalance());
//        System.out.println(tamanAccount.getSocialSecurityNumber());
    }
}
