package org.example;

public class HeartBeat implements Runnable {
    private int milliSecondsBetweenBeats;

    public HeartBeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Heart beat ❤");
            try {
                Thread.sleep(milliSecondsBetweenBeats);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
