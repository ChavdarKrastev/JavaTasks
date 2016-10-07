package CredentialsManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        String user;
        String password;

        while (command != "END") {
            switch (command) {
                case "ENROLL":
                    user = sc.next();
                    password = sc.next();
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
                    user = sc.next();
                    password = sc.next();
                    String newPassword = sc.next();
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
                    user = sc.next();
                    password = sc.next();
                    if (Credentials.findObject(user).checkPassword(password)
                            && Credentials.userExist(user)) {
                        System.out.println("CHPASS success");
                        break;
                    } else {
                        System.out.println("CHPASS fail");
                        break;
                    }

            }
            command = sc.nextLine();
        }
    }
}
