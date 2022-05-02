package com.company;
//Unit5
//Practice week

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 5.1
        /*Напишите класс Balance для описания весов с двумя чашами, которые будут балансировать.
        В этом классе должны быть следующие методы:
        addRight(int n) — добавить на правую чашу (метод ничего не возвращает);
        addLeft(int n) — добавить на левую чашу (метод также ничего не возвращает);
        getSituation() — метод вернет =, если вес на обеих чашах равен, R — если вес на правой больше, L — на левой больше.*/
        Balance balance = new Balance();
        System.out.println("Введите вес на левой чаше (целое число): ");
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        balance.l = Integer.parseInt(l);

        System.out.println("Введите вес на правой чаше (целое число): ");
        Scanner scanner1 = new Scanner(System.in);
        String r = scanner1.nextLine();
        balance.r = Integer.parseInt(r);

        String result = balance.getSituation();
        System.out.println(result);
    }
}
