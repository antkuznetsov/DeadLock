package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */
public class A {

    synchronized void foo (B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод A.foo()");
        try {
            Thread.sleep(2000);
        } catch (Exception е) {
            System.out.println("Клacc А прерван");
        }
        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("B методе A.last()");
    }
}
