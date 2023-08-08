package phuongTrinhBac1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("trình giải phương trình ");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a: ");
        double a=scanner.nextDouble();
        System.out.println("b: ");
        double b=scanner.nextDouble();
        System.out.println("c: ");
        double c=scanner.nextDouble();
        if (a!=0){
            double answer=(c-b)/a;
            System.out.printf("truyền phương trình x= %f!\n",answer);
        }else {
            if (b==c){
                System.out.print("giải pháp là tất cả x!");
            }else {
                System.out.println("không có giải pháp");
            }
        }
    }
}
