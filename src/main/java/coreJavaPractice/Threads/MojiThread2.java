package coreJavaPractice.Threads;

/**
 * Created by Moji on 18-Oct-17.
 * mojtaba.nasehzadeh@gmail.com
 */
public class MojiThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MojiThread2 : " + sum(1, 2, 3));
    }

    public static void main(String[] args) throws InterruptedException {
        MojiThread t1 = new MojiThread();

        MojiThread2 mojiThread2 = new MojiThread2();
        Thread t2 = new Thread(mojiThread2);

        MojiThread t3 = new MojiThread();

        t1.start();
        t2.start();
        t3.join();



//        ExecutorService a = Executors.newSingleThreadExecutor();
//        a.execute(new Runnable() {
//            @Override
//            public void run() {
//                sum(1, 2, 3);
//            }
//        });
//
//        ExecutorService b = Executors.newFixedThreadPool(10);
//        ExecutorService c = Executors.newScheduledThreadPool(10);

    }

    synchronized static int sum(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    // synchronized block example
    public void log2(String msg1, String msg2) {
        synchronized (this) {
            //code here
        }
    }


}
