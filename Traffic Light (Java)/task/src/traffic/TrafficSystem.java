package traffic;

import static java.lang.Thread.sleep;

public class TrafficSystem implements Runnable {
    private boolean systemState = false;
    private int seconds = 0;

    @Override
    public void run() {
        while (true) {
            if (systemState) {
                Main.clearScreen();
                printStat();
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            seconds++;
            Main.roadsQueue.addSecond();
        }
    }

    private void printStat() {
        System.out.println("! " + seconds + "s. have passed since system startup !");
        System.out.println("! Number of roads: " + Main.roads + " !");
        System.out.println("! Interval: " + Main.interval + " !");
        Main.roadsQueue.print();
        System.out.println("! Press \"Enter\" to open menu !");
    }

    public boolean getSystemState() {
        return systemState;
    }

    public void setSystemState(boolean systemState) {
        this.systemState = systemState;
    }
}
