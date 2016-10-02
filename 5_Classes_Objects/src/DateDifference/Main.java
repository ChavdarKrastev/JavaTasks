
package DateDifference;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner date = new Scanner(System.in);
        System.out.println("Enter 1st date - yyyy MM dd");
        short year = date.nextShort();
        date.nextLine();
        short month = date.nextShort();
        date.nextLine();
        byte day = date.nextByte();
        date.nextLine();
        
        System.out.println("Enter 2nd date - yyyy MM dd");
        
        short year2 = date.nextShort();
        date.nextLine();
        short month2 = date.nextShort();
        date.nextLine();
        byte day2 = date.nextByte();
        date.nextLine();
        
        SwiftDate firstDate = new SwiftDate();
        firstDate.year = year;
        firstDate.month = month;
        firstDate.day = day;
        
        SwiftDate secondDate = new SwiftDate();
        secondDate.year = year2;
        secondDate.month = month2;
        secondDate.day = day2;
        
        System.out.println(firstDate.getDaysDifference(secondDate.day, secondDate.month, secondDate.year));
        firstDate.printInfo();
        secondDate.printInfo();
    }
    
}
