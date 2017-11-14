package coreJavaPractice.Threads;

/**
 * Created by Moji on 18-Oct-17.
 * mojtaba.nasehzadeh@gmail.com
 */
public class MojiThread extends Thread {
    @Override
    public void run() {
        System.out.println("MojiThread : " + MojiThread2.sum(1, 2, 3));

    }

}
