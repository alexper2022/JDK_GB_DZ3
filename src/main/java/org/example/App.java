package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;

/*
1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
   sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
   над которыми должна быть произведена операция.

2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
   если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но
   должны иметь одинаковую длину и содержать элементы одного типа по парно. (используйте instanceof)

3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
   Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих
   пары, а также переопределение метода toString(), возвращающее строковое представление пары.
*/
public class App {
    public static void main(String[] args) {

        final DecimalFormat formatD = new DecimalFormat("#0.00");
        System.out.println("1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:\n" +
                "sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,\n" +
                "над которыми должна быть произведена операция.");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(formatD.format(Calculator.multiply(2.5555d, 2.4f)));
        System.out.println(formatD.format(Calculator.divide(1, 2.4f)));
        System.out.println(formatD.format(Calculator.subtract(1, 2.4f)));
        System.out.println(formatD.format(Calculator.sum(1, 2.4f)));
        System.out.println("---------------------------------------------------------------------------------------------\n");

        System.out.println("2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,\n" +
                "если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но\n" +
                "должны иметь одинаковую длину и содержать элементы одного типа по парно. (используйте instanceof)");
        System.out.println("---------------------------------------------------------------------------------------------");
        ArrayList arrayList1 = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add("111");
        arrayList1.add('a');
        arrayList1.add(11.5f);
        arrayList1.add(12.12d);
        arrayList2.add(2);
        arrayList2.add("222");
        arrayList2.add('b');
        arrayList2.add(11.9f);
        arrayList2.add(12.54d);
        System.out.println(arrayList1 + "\n" + arrayList2);
        System.out.println(Calculator.compareArrays(arrayList1, arrayList2));
        System.out.println("---------------------------------------------------------------------------------------------");
        arrayList1.add(12.12d);
        arrayList2.add("12.12d");
        System.out.println(arrayList1 + "\n" + arrayList2);
        System.out.println(Calculator.compareArrays(arrayList1, arrayList2));
        System.out.println("---------------------------------------------------------------------------------------------");
        arrayList2.add("5.6f");
        System.out.println(arrayList1 + "\n" + arrayList2);
        System.out.println(Calculator.compareArrays(arrayList1, arrayList2));
        System.out.println("---------------------------------------------------------------------------------------------\n");

        System.out.println("3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.\n" +
                "Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих\n" +
                "пары, а также переопределение метода toString(), возвращающее строковое представление пары.");
        System.out.println("---------------------------------------------------------------------------------------------");
        Pair pair1 = new Pair(1, "gamma");
        Pair pair2 = new Pair(1.2f, 'd');
        Pair pair3 = new Pair('a', 1);
        System.out.println("pair1.getFirstValue = " + pair1.getFirstValue());
        System.out.println("pair1.getSecondValue = " + pair1.getSecondValue());
        System.out.println("pair1.toString = " + pair1);
        System.out.println("pair1.getFirstValue = " + pair2.getFirstValue());
        System.out.println("pair1.getSecondValue = " + pair2.getSecondValue());
        System.out.println("pair1.toString = " + pair2);
        System.out.println("pair1.getFirstValue = " + pair3.getFirstValue());
        System.out.println("pair1.getSecondValue = " + pair3.getSecondValue());
        System.out.println("pair1.toString = " + pair3);
        System.out.println("---------------------------------------------------------------------------------------------\n");

    }
}
