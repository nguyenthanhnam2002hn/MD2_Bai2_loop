import java.util.Scanner;

public class Bt2_greatest_common_divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị a :");
        int a = scanner.nextInt();
        System.out.println("nhập giá trị b :");
        int b = scanner.nextInt();
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("ước chung la :" + a);
    }
}
