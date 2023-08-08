package ngayTrongThang;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("muốn đếm ngày trong tháng nào");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("the month '2' has 28 or 29 day!");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("the month"+month+"has 31 ");
                break;
            case 4,6,9,11:
                System.out.println("the month"+month+"has 30 ");
                break;
            default:
                System.out.println("không hợp lệ");
                break;
        }
    }
}
