package UniversityManagement;

import java.util.Scanner;

public class UniversityManagement {

    static void idle() {
        for (int i = 0; i < 500; i++) {
            if (Student.students[i] != null) {
                Student.students[i].setTolerance(Student.students[i].getTolerance() - 5);
            } if (Teacher.teachers[i] != null) {
                Teacher.teachers[i].setTolerance(Teacher.teachers[i].getTolerance() - 5);
            } if (AdministrationEmployee.admins[i] != null) {
                AdministrationEmployee.admins[i].setTolerance(AdministrationEmployee.admins[i].getTolerance() - 5);
            } if (MaintenanceEmployee.maintenance[i] != null) {
                MaintenanceEmployee.maintenance[i].setTolerance(MaintenanceEmployee.maintenance[i].getTolerance() - 5);
            }
        }
    }

    public static void main(String[] args) {

        University uni = new University(500);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splittedBySpace;
        splittedBySpace = str.split(" ");

        String command = splittedBySpace[0];
        String name = splittedBySpace[2];
        String phone = splittedBySpace[3];
        int tolerance = 20;

        while (!command.equals("END")) {
            switch (command) {
                case "NEW":
                    switch (splittedBySpace[1]) {
                        case "MAINT":
                            MaintenanceEmployee maint = new MaintenanceEmployee(splittedBySpace[2], splittedBySpace[3], tolerance);
                            MaintenanceEmployee.maintenance[MaintenanceEmployee.counter] = maint;
                            MaintenanceEmployee.counter++;
                            break;
                        case "STUD":
                            String[] studSubjects = new String[splittedBySpace.length - 5];

                            for (int i = 4; i < splittedBySpace.length - 1; i++) {
                                studSubjects[i - 4] = splittedBySpace[i];
                            }
                            Student stud = new Student(splittedBySpace[2], splittedBySpace[3], tolerance, splittedBySpace[4], studSubjects);
                            Student.students[Student.counter] = stud;
                            Student.counter++;
                            break;
                        case "TEACH":
                            String[] teachSubjects = new String[splittedBySpace.length - 4];
                            for (int i = 3; i < splittedBySpace.length - 1; i++) {
                                teachSubjects[i - 3] = splittedBySpace[i];
                            }

                            Teacher teach = new Teacher(splittedBySpace[2], splittedBySpace[3], tolerance, teachSubjects);
                            Teacher.teachers[Teacher.counter] = teach;
                            Teacher.counter++;
                            break;
                        case "ADMIN":
                            String[] adminSubjects = new String[splittedBySpace.length - 4];
                            for (int i = 3; i < splittedBySpace.length - 1; i++) {
                                adminSubjects[i - 3] = splittedBySpace[i];
                            }

                            AdministrationEmployee admin = new AdministrationEmployee(splittedBySpace[2], splittedBySpace[3], tolerance, adminSubjects);
                            AdministrationEmployee.admins[AdministrationEmployee.counter] = admin;
                            AdministrationEmployee.counter++;
                    }
                    break;
                case "IDLE":
                    idle();
                    break;
                case "WORK":
                    for (int i = 0; i < 500; i++) {
                        if ((AdministrationEmployee.admins[i] != null) && (AdministrationEmployee.admins[i].getName().equals(splittedBySpace[1]))) {
                            AdministrationEmployee.admins[i].work(uni);
                        } else if ((MaintenanceEmployee.maintenance[i] != null) && (MaintenanceEmployee.maintenance[i].getName().equals(splittedBySpace[1]))) {
                            MaintenanceEmployee.maintenance[i].work(uni);
                        } else if ((Teacher.teachers[i] != null) && (Teacher.teachers[i].getName().equals(splittedBySpace[1]))) {
                            Teacher.teachers[i].work(uni);
                        } else if ((Student.students[i] != null) && (Student.students[i].getName().equals(splittedBySpace[1]))) {
                            Student.students[i].work(uni);
                        }
                    }
                    break;
            }

            str = sc.nextLine();
            splittedBySpace = str.split(" ");

            command = splittedBySpace[0];

            for (int i = 0; i < 500; i++) {
                if ((AdministrationEmployee.admins[i] != null) && (AdministrationEmployee.admins[i].getTolerance() <= 0)) {
                    System.out.println(AdministrationEmployee.admins[i].getName() + " is not happy");
                    command = "END";
                    break;
                } else if ((MaintenanceEmployee.maintenance[i] != null) && (MaintenanceEmployee.maintenance[i].getTolerance() <= 0)) {
                    System.out.println(MaintenanceEmployee.maintenance[i].getName() + " is not happy");
                    command = "END";
                    break;
                } else if ((Teacher.teachers[i] != null) && (Teacher.teachers[i].getTolerance() <= 0)) {
                    System.out.println(Teacher.teachers[i].getName() + " is not happy");
                    command = "END";
                    break;
                } else if ((Student.students[i] != null) && (Student.students[i].getTolerance() <= 0)) {
                    System.out.println(Student.students[i].getName() + " is not happy");
                    command = "END";
                    break;
                } else if (uni.getBalance() <= 0) {
                    System.out.println("bankruptcy");
                    command = "END";
                    break;
                }
            }

        }

    }

}
