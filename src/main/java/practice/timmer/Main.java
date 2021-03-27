package practice.timmer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is complete");
            }
        };

        timer.schedule(task, 3000);


        TimerTask task2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task 2 is complete");
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,Calendar.JUNE);
        date.set(Calendar.HOUR_OF_DAY,0);
        //more can be added

        timer.schedule(task2,date.getTime());



        TimerTask task3 = new TimerTask() {
            int count =10;
            @Override
            public void run() {
                if(count >0) {
                    System.out.println("Task 3 is complete Second" + count);
                    count--;
                }else{
                    System.out.println("ALl periodic task done");
                    timer.cancel();
                }

            }
        };
        timer.scheduleAtFixedRate(task3, 0, 1000);
    }

}
