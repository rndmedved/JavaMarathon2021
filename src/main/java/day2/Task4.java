package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();
        System.out.println(y(x));
    }
    public static double y(double x){
        if (x >= 5) {
            return (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3 && x < 5){
            return (x + 3) * (Math.pow(x, 2) - 2);
        } else  return 420;
    }
}
