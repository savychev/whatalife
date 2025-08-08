package org.example;

import java.util.Random;

public class Person implements Runnable {
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;

    public Person(String name, int age, int heartBeatMilliSeconds) {
        this.name = name;
        this.age = age;
        this.life = new Thread(this);
        this.heart = new Thread(new HeartBeat(heartBeatMilliSeconds));
        this.breathing = new Thread(new Lungs());
    }

    public Person() {
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = age; i < 100; i++){
            System.out.println(name + " is now " + i + " years old.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            if (random.nextInt(20) == 13) {
                endLife();
                break;
            }
        }
    }

    public void startLife() {
        heart.start();
        breathing.start();
        life.start();
    }

    public void endLife() {
        heart.interrupt();
        breathing.interrupt();
        life.interrupt();
        System.out.println(name + " is died.");
    }
}
