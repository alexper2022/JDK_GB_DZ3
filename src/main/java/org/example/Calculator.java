package org.example;

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

import java.text.DecimalFormat;
import java.util.AbstractList;

public class Calculator {

    private static final DecimalFormat formatD = new DecimalFormat("#0.00");

    public static <T1 extends Number, T2 extends Number> void multiply(T1 t1, T2 t2) {
        System.out.println(t1 + " * " + t2 + " = " +
                formatD.format(t1.doubleValue() * t2.doubleValue()));
    }

    public static <T1 extends Number, T2 extends Number> void divide(T1 t1, T2 t2) {
        System.out.println(t1 + " / " + t2 + " = " +
                formatD.format(t1.doubleValue() / t2.doubleValue()));
    }

    public static <T1 extends Number, T2 extends Number> void subtract(T1 t1, T2 t2) {
        System.out.println(t1 + " - " + t2 + " = " +
                formatD.format(t1.doubleValue() - t2.doubleValue()));
    }

    public static <T1 extends Number, T2 extends Number> void sum(T1 t1, T2 t2) {
        System.out.println(formatD.format(t1) + " + " + formatD.format(t2) + " = " +
                formatD.format(t1.doubleValue() + t2.doubleValue()));
    }

    public static <T1 extends AbstractList> boolean compareArrays(T1 array1, T1 array2) {
        if (array1.size() == array2.size()) {
            for (int i = 0; i < array1.size(); i++) {
                if (!array1.get(i).getClass().getName().equals(array2.get(i).getClass().getName()) || !array1.get(i).equals(array2.get(i))) {
                    return false;
                }
            }
        } else {
            System.out.println("Размеры массивов не совпадают");
            return false;
        }
        return true;
    }
}
