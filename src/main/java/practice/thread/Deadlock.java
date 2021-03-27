package practice.thread;

public class Deadlock {

    String s1 ="test1";
    String s2 ="test2";

    Thread t1 =  new Thread(){
        public void run(){
            while (true){
                synchronized (s1){
                    try {
                        System.out.println(" locked"+ Thread.currentThread().getName()+s1);
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (s2){
                        System.out.println(" locked"+ Thread.currentThread().getName()+s2);
                        System.out.println(s1+s2);
                    }
                }
            }
        }
    };


    Thread t2 =  new Thread(){
        public void run(){
            while (true){
                synchronized (s2){
                    System.out.println(" locked"+ Thread.currentThread().getName()+s2);
                    synchronized (s1){
                        System.out.println(" locked"+ Thread.currentThread().getName()+s1);
                        System.out.println(s1+s2);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        deadlock.t1.start();
        deadlock.t2.start();
    }
}
