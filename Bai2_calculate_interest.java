import java.util.Scanner;

public class Bai2_calculate_interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tiền gửi :");
        float TG = scanner.nextFloat();
        float LX = 12f;
        System.out.println("số tháng gửi :");
        int STG = scanner.nextInt();
        float TL = TG * LX/1200 * STG;
        System.out.println("tiền lãi trong " + STG + " thang " + TL);
    }
}
