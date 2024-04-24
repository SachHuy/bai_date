package com.mycompany.bai2;

public class Bai2 {

    public static void main(String[] args) {
        // Đầu vào mẫu để kiểm thử
        int day = 30;
        int month = 12;
        int year = 2012;

        // Gọi hàm NextDate và in ra kết quả
        String nextDate = NextDate(day, month, year);
        System.out.println("Ngày kế tiếp là: " + nextDate);
    }

    public static String NextDate(int day, int month, int year) {
        // Số ngày trong các tháng
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        // Kiểm tra tính hợp lệ của ngày, tháng, năm
        if (day < 1 || day > daysInMonth[month] || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Ngày không hợp lệ";
        }

        // Tăng ngày lên 1
        day++;
        if (day > daysInMonth[month]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        // Trả về ngày kế tiếp dưới dạng chuỗi
        return day + "/" + month + "/" + year;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}