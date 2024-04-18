//WAP that executes to threads. One thread displays "An" after every 1000ms & the other displays "B" after every 3000ms. Create the threads by executing the thread class.

package LAB_08;

class First extends Thread {
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.print("An    ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nB    ");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}

public class prg_33_Thread1 {
    public static void main(String args[]) {
        System.out.println();
        First F = new First();
        Second S = new Second();
        F.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        S.start();
    }
}
