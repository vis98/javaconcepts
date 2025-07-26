public class PingPong {
    private static final int MAX_COUNT = 5;
    private boolean pingTurn = true;

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        Thread pingThread = new Thread(() -> pingPong.printPing());
        Thread pongThread = new Thread(() -> pingPong.printPong());

        pingThread.start();
        pongThread.start();
    }

    // public static void main(String[] args) { //intiaizing 5 threads
    //     for (int i = 1; i <= 5; i++) {
    //         int threadNumber = i; // need a final or effectively final variable
    //         Thread thread = new Thread(() -> {
    //             System.out.println("Hello from Thread-" + threadNumber);
    //         });
    //         thread.start();
    //     }
    // }

    public synchronized void printPing() {
        for (int i = 0; i < MAX_COUNT; i++) {
            while (!pingTurn) {
                try {
                    wait(); // wait for turn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Ping");
            pingTurn = false;
            notify(); // notify pong thread
        }
    }

    public synchronized void printPong() {
        for (int i = 0; i < MAX_COUNT; i++) {
            while (pingTurn) {
                try {
                    wait(); // wait for turn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pong");
            pingTurn = true;
            notify(); // notify ping thread
        }
    }
}
