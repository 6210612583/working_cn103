//package account;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cn103
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account myAccount;
        myAccount = new Account();
        System.out.println("Create an Account.");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Account No.     => ");
        int id = sc.nextInt();
        myAccount.setId(id);
        System.out.printf("Enter Initial Balance => ");
        double money = sc.nextDouble();
        myAccount.setBalance(money);
        System.out.printf("Enter Initial AIR     => ");
        double tex = sc.nextDouble();
        myAccount.setannualInterestRate(tex);
        System.out.println("Account No.: " + myAccount.getId());
        System.out.println("Balance    : " + myAccount.getBalance());
        System.out.println("AIR        : " + myAccount.getannualInterestRate());
        System.out.println("Created    : " + myAccount.getDateCreated());
        System.out.println();
        System.out.printf("Enter deposit    => ");
        double deposit = sc.nextDouble();
        myAccount.deposit(deposit);
        System.out.println("Account No.: " + myAccount.getId());
        System.out.println("balance    : " + myAccount.getBalance());
        System.out.printf("Enter withdrawal   => ");
        double withdrawal = sc.nextDouble();
        myAccount.withdraw(withdrawal);
        System.out.println("Account No.: " + myAccount.getId());
        System.out.println("balance    : " + myAccount.getBalance());
    }

}
