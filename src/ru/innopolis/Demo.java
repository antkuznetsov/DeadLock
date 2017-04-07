package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */
public class Demo extends Thread {

    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public void test () {
        System.out.println("Сообщение из метода");
    }
}
