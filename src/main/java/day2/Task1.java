package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
        scanner.close();
        if (floor < 1) {
            System.out.println("Ошибка ввода");
        }else if (floor < 5) {
            System.out.println("Малоэтажный дом");
        }else if(floor < 9){
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
