package baiTap;

import java.util.Scanner;

public class chyenTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int VND, USD, rate;
        System.out.println("nhập tiền usd ");
        USD = scanner.nextInt();
        rate = USD * 2300;
        System.out.println("số tiền vnd là " + rate);
    }
}
