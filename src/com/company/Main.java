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

        //Task 5.2
        /*Напишите класс Bell, имеющий всего один метод sound,
        если он был вызван, то метод должен напечатать в консоль ding или dong.
        Первый звук всегда ding, второй — dong, третий — снова ding и так далее.*/
        System.out.println("");

        Bell bell = new Bell();
        bell.sound();
        bell.sound();

        //Task 5.3
        /*Опишите класс Payer. В классе должны быть следующие поля:
        surname (фамилия, строка);
        name (имя, строка);
        address (адрес, строка);
        cardNumber (номер карты, строка).
        Реализуйте конструктор, принимающий эти параметры (surname, name, address, cardNumber)
        и метод public toString(), возвращающий строку вида Payer: surname name, address: address, card: cardNumber.*/
        System.out.println("");

        Payer payer = new Payer("Ivan", "Ivanov", "Almaty, Kazakhstan", "0000 0000 0000 0000");
        System.out.println(payer.toString());

        //Task 5.4
        /*Создать класс Dog. У собаки должны быть следующие поля:
        name (кличка, строка);
        age (возраст, число).
        Оба поля должны быть приватными и иметь геттеры и сеттеры.
        Реализуйте в классе конструктор, принимающий данные поля (name, age).
        Создайте метод bark() (лаять), метод должен возвращать строку woof.*/
        System.out.println("");

        Dog dog = new Dog("Rex", 2);
        System.out.println(dog.getName() + " " + dog.getAge());

        //Task 5.5
        /*Создайте класс Human со следующими полями:
        name (имя, строка);
        age (возраст, число);
        weight (вес, число);
        address (адрес, строка);
        work (работа, строка).
        Создайте 5 инициализаторов (конструкторов), принимающих:
        name, age;
        name, address;
        name, age, weight;
        name, age, work;
        age, weight, address, work.
        Задача конструктора — создать полноценный объект (сделать его валидным).
        То есть, если вес неизвестен, то нужно указать хоть какой-нибудь средний вес,
        то же касается возраста и имени, а вот адреса и работы может и не быть (равны null).*/
        System.out.println("");

        Human human = new Human("Petr",22);
        Human human2 = new Human("Ivan", "Kazakhstan, Almaty");
        Human human3 = new Human("Igor", 32, 82);
        Human human4 = new Human("Igor", 29, "QA dev");
        Human human5 = new Human(19, 75, "Kazakhstan, Almaty", "Java dev");

        System.out.println(human.name + " " + human.age + " " + human.weight +  " " + human.address  + " " + human.work);
        System.out.println(human2.name + " " + human2.age + " " + human2.weight +  " " + human2.address  + " " + human2.work);
        System.out.println(human3.name + " " + human3.age + " " + human3.weight +  " " + human3.address  + " " + human3.work);
        System.out.println(human4.name + " " + human4.age + " " + human4.weight +  " " + human4.address  + " " + human4.work);
        System.out.println(human5.name + " " + human5.age + " " + human5.weight +  " " + human5.address  + " " + human5.work);

        //Task 5.6
        /*Напишите класс Programmer.
        Переменные:
        name (имя, строка);
        company (имя компании, строка);
        position (позиция, строка);
        конструктор, принимающий name и company;
        метод getPosition(), возвращающий строку — позицию программиста.
        метод work(), поднимающий позицию программиста на уровень вверх
        (с самого начала (при инициализации) программист — intern (стажер),
        потом junior (джуниор), далее middle, senior, lead).*/
        System.out.println("");
        Programmer proger = new Programmer("Abay", "KaspiBank");
        System.out.println(proger.name + " " + proger.company + " " + proger.position + " - ");
        proger.work();
        System.out.println(proger.getPosition());

        //Task 5.7
        /*Напишите класс LimitingRectangle (ограничивающий точки прямоугольник),
        класс принимает точки на плоскости и строит прямоугольник.
        Если точка лежит на границе прямоугольника, то считаем, что она в него входит.
        В нем должны быть:
        поле points (двумерный массив целых чисел);
        конструктор, принимающий двумерный массив целых чисел (массив точек на плоскости вида [[1, 0], [2, 3], ...],
          0 элемент — координата по оси X, 1 элемент — по оси Y);
        метод getWidth(), возвращающий целое число (ширину прямоугольника);
        метод getHeight(), возвращает целое число (высоту прямоугольника);
        метод getBorders, возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.
        Пример:
        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
        System.out.println(r.getWidth() +   + r.getHeight());
        System.out.println(r.getBorders());
        Вывод:
        4 6
        -2, 4, -1, 3*/
        System.out.println("");

        LimitingRectangle rectangle = new LimitingRectangle(new int[][]{{-1, -2}, {3, 4}});
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight());
        System.out.println(rectangle.getBorders());


        //Task 5.8
        /*Напишите класс Separator.
        Добавьте в него поле array и конструктор, инициализирующий его.
        Также реализуйте методы even() и odd(), они должны возвращать массив четных или нечетных чисел,
        отобранных из array.*/
        System.out.println("");
        int [] Array1 = new int[]{1,2,3,4,5,6,7};
        Separator s = new Separator(Array1);
        System.out.println("Четные: ");
        for (int element: s.odd() ) {  System.out.println(element);}
        System.out.println("Нечетные: ");
        for (int element: s.even()) {  System.out.println(element);}

    }
}
