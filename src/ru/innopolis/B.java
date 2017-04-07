package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */
public class B {

    synchronized void bar(A a) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try {

        } catch (Exception e) {
            System.out.println("Клacc В прерван");
        }
        System.out.println(name + "  пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("B методе A.last()");
    }

}