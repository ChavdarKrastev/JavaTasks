package CredentialsManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] splittedBySpace;
        splittedBySpace = str.split(" ");

        String command = splittedBySpace[0];
        String user = splittedBySpace[1];
        String password = splittedBySpace[2];
        String newPassword = null;

        while (!command.equals("END")) {
            switch (command) {
                case "ENROLL":
                    if (!Credentials.userExist(user)) {
                        Credentials User = new Credentials(user, password);
                        Credentials.addObject(User);
                        User.savePassword(password);
                        System.out.println("ENROLL success");
                        break;
                    } else {
                        System.out.println("ENROLL fail");
                        break;
                    }
                case "CHPASS":
                    if (Credentials.userExist(user)) {
                        if (Credentials.findObject(user).checkPassword(password)
                                && (!Credentials.findObject(user).isPasswordUsed(newPassword))) {
                            Credentials.findObject(user).setPassword(newPassword);
                            Credentials.findObject(user).savePassword(newPassword);
                            System.out.println("CHPASS success");
                            break;
                        } else {
                            System.out.println("CHPASS fail");
                            break;
                        }
                    } else {
                        System.out.println("CHPASS fail");
                        break;
                    }
                case "AUTH":
                    if (Credentials.findObject(user).checkPassword(password)
                            && Credentials.userExist(user)) {
                        System.out.println("AUTH success");
                        break;
                    } else {
                        System.out.println("AUTH fail");
                        break;
                    }
            }
            str = sc.nextLine();
            splittedBySpace = str.split(" ");
            if (splittedBySpace.length == 4) {
                command = splittedBySpace[0];
                user = splittedBySpace[1];
                password = splittedBySpace[2];
                newPassword = splittedBySpace[3];
            }
            if (splittedBySpace.length == 3) {
                command = splittedBySpace[0];
                user = splittedBySpace[1];
                password = splittedBySpace[2];
            }
            if (splittedBySpace.length == 1) {
                command = splittedBySpace[0];
            }
        }
    }
}
