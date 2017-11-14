package coreJavaPractice.Threads;

class Calculator extends Thread {
    long sum;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000000; i++) {
                sum += i;//499999500000
            }
            notify();
        }
    }
}

class ThreadWaitAndNotify {
    public static void main(String[] args) {
        Calculator calcThread = new Calculator();
        calcThread.start();
        synchronized (calcThread) {
            try {
                calcThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(calcThread.sum);
    }
}


