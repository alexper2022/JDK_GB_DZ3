package org.example;

/*
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
   Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих
   пары, а также переопределение метода toString(), возвращающее строковое представление пары.
*/

public class Pair<T1, T2> {
    T1 firstValue;
    T2 secondValue;

    public Pair(T1 firstValue, T2 secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T1 getFirstValue() {
        return firstValue;
    }

    public T2 getSecondValue() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "Pair: firstValue= " + firstValue + ", secondValue= " + secondValue;
    }
}
