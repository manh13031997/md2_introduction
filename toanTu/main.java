package toanTu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập width");
        width=scanner.nextFloat();
        System.out.println("nhập height");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("area "+area);
    }
}
