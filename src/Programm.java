import java.util.Scanner;

public class Programm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X");
        int x = scanner.nextInt();
        System.out.println("Введите Y");
        int y = scanner.nextInt();
        System.out.println("Введите Z");
        int z = scanner.nextInt();
        double a = (x + y + z)/3.0;
        System.out.println("Среднее арифметическое " + a);
        double b = Math.floor(a);
        System.out.println("Округлённое " + b);
        if (b > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
