package DateDifference;

public class SwiftDate {

    short year;
    short month;
    byte day;

    boolean isLeapYear(short year) {
        boolean leap = false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            leap = true;
        }
        return leap;
    }

    int getCentury(int year) {
        int century;
        century = year / 100 + 1;
        return century;
    }

    int daysInYear(int month) {
        int days = 0;
        switch (month) {
            case 0b01:
                days += 0;
                break;
            case 0b10:
                days += 31;
                break;
            case 0b11:
                days += 59;
                break;
            case 0b101:
                days += 90;
                break;
            case 0b110:
                days += 120;
                break;
            case 0b111:
                days += 151;
                break;
            case 0b1000:
                days += 181;
                break;
            case 0b1001:
                days += 212;
                break;
            case 0b1010:
                days += 243;
                break;
            case 0b1011:
                days += 273;
                break;
            case 0b1100:
                days += 304;
                break;
            case 0b1101:
                days += 334;
                break;

        }
        return days;
    }

    int getDaysDifference(byte day, short month, short year) {
        int diff = 0;
        int days = this.day;
        short months = this.month;
        int tempDays = 0;

        if (this.year == year) {
            tempDays = days + daysInYear(months);
            diff = day + daysInYear(month);
            diff -= tempDays;
            if (isLeapYear(year) && (tempDays <= 60) && (diff > 60)) {
                diff += 1;
            }
        }

        if (year - this.year == 1) {
            tempDays = 365 - (days + daysInYear(months));
            diff = day + daysInYear(month);
            diff += tempDays;
            if (((isLeapYear(this.year)) && (tempDays <= 60)) || ((isLeapYear(year)) && (diff > 60))) {
                diff += 1;
            }
        }

        if (year - this.year > 1) {
            short yearsCount = this.year;
            int daysInYear = 0;
            for (int i = 1; i <= year - (yearsCount + 1); i++) {
                yearsCount += i;
                if ((isLeapYear(yearsCount))) {
                    daysInYear += 366;
                }
                daysInYear += 365;

            }
            tempDays = 365 - (days + daysInYear(months));
            diff = day + daysInYear(month);
            diff += tempDays;
            if (((isLeapYear(this.year)) && (tempDays <= 60)) || ((isLeapYear(year)) && (diff > 60))) {
                diff += 1;
            }
            diff += daysInYear;

        }
        return diff;
    }

    short test(short year) {

        //short a = this.year;
        short t = year;

        return t;
    }

    public void printInfo() {

        if (isLeapYear(this.year) == true) {
            if (this.month < 10) {
                System.out.printf("%d %02d %d - %d century. [It is a leap year]", this.year, this.month, this.day, getCentury(this.year));
            } else if (this.day < 10) {
                System.out.printf("%d %d %02d - %d century. [It is a leap year]", this.year, this.month, this.day, getCentury(this.year));
            } else if ((this.day < 10) && (this.month < 10)) {
                System.out.printf("%d %02d %02d - %d century. [It is a leap year]", this.year, this.month, this.day, getCentury(this.year));
            } else {
                System.out.printf("%d %d %d - %d century. [It is a leap year]", this.year, this.month, this.day, getCentury(this.year));
            }
        } else if (this.month < 10) {
            System.out.printf("%d %02d %d - %d century.", this.year, this.month, this.day, getCentury(this.year));
        } else if (this.day < 10) {
            System.out.printf("%d %d %02d - %d century.", this.year, this.month, this.day, getCentury(this.year));
        } else if ((this.day < 10) && (this.month < 10)) {
            System.out.printf("%d %02d %02d - %d century.", this.year, this.month, this.day, getCentury(this.year));
        } else {
            System.out.printf("%d %d %d - %d century", this.year, this.month, this.day, getCentury(this.year));
        }
        System.out.println();

    }
}
