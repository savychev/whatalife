package org.example;

public class Lungs implements Runnable {
    private boolean lungsFull = false;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (!lungsFull) {
                System.out.println("🫁⬆️ Inhale... ");
                lungsFull = true;
            } else {
                System.out.println("🫁⬇️ Exhale...");
                lungsFull = false;
            }

            try {
                Thread.sleep(1000); // a second between breathing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}
