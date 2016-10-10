package BankManagement;

import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] splittedBySpace;
        splittedBySpace = str.split(" ");

        String command = splittedBySpace[0];
        String user;
        String password;
        String name;
        String recipient;
        double amount;
        long govld;

        while (!command.equals("END")) {

            switch (command) {
                case "OPEN":
                    if (splittedBySpace.length != 5) {
                        System.out.println("OPEN fail");
                        break;
                    } else {
                        user = splittedBySpace[1];
                        password = splittedBySpace[2];
                        name = splittedBySpace[3];
                        govld = Long.parseLong(splittedBySpace[4]);
                        bank1.openAccount(name, govld, user, password);
                        System.out.println("OPEN success");
                        break;
                    }
                case "CLOSE":
                    if (splittedBySpace.length != 2) {
                        System.out.println("CLOSE fail");
                        break;
                    } else {
                        user = splittedBySpace[1];
                        password = splittedBySpace[2];
                        bank1.closeAccount(user, password);
                        System.out.println("CLOSE success");
                        break;
                    }

                case "DEPOSIT":
                    if (splittedBySpace.length != 2) {
                        System.out.println("DEPOSIT fail");
                        break;
                    } else {
                        user = splittedBySpace[1];
                        amount = Double.parseDouble(splittedBySpace[2]);
                        bank1.deposit(user, amount);
                        System.out.println("DEPOSIT success");
                        break;
                    }
                case "WITHDRAW":
                    if (splittedBySpace.length != 4) {
                        System.out.println("WITHDRAW fail");
                        break;
                    } else {
                        user = splittedBySpace[1];
                        password = splittedBySpace[2];
                        amount = Double.parseDouble(splittedBySpace[3]);
                        bank1.withdraw(user, password, amount);
                        System.out.println("WITHDRAW success");
                        break;
                    }
                case "TRANSFER":
                    if (splittedBySpace.length != 5) {
                        System.out.println("TRANSFER fail");
                        break;
                    }
                    user = splittedBySpace[1];
                    password = splittedBySpace[2];
                    amount = Double.parseDouble(splittedBySpace[3]);
                    recipient = splittedBySpace[4];
                    bank1.transfer(user, password, amount, recipient);
                    System.out.println("TRANSFER success");
                    break;
            }

            str = sc.nextLine();
            splittedBySpace = str.split(" ");
            command = splittedBySpace[0];
        }
    }

}
