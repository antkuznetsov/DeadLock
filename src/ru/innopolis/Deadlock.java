package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

    Deadlock () {
        Thread.currentThread().setName("Глaвный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();
        a.foo(b); // получить блокировку объекта а в этом потоке исполнения
        System.out.println ("Назад в главный поток");
    }

    public void run() {
        b.bar(a);
        System.out.println("Назад в другой поток");
    }
}
