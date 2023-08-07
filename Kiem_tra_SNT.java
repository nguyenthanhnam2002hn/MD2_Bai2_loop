import java.util.Scanner;

public class Kiem_tra_SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input :");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(number + " là số nguyên tố");
        }
        else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
