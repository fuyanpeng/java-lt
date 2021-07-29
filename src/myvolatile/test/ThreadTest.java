package myvolatile.test;

public class ThreadTest {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        for (;;){
//            synchronized (t) {
                if (t.isFlag()) {
                    System.out.println("has some ting");
                    return;
                }
//            }
        }

    }
}

class MyThread extends Thread {
    private volatile boolean flag = false;

    public boolean isFlag(){
        return flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag=" + flag);
    }
}