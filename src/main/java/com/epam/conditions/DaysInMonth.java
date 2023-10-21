package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int daysInMonth;

        switch (month) {
            case 2:
                daysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }

        System.out.println(daysInMonth);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
