package MultiThreading.Digest_Eng.Executor_Framework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_Ext_srv {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);

        schedule.schedule( () -> System.out.println("Tack executed after 5 Secoends !.."),
                5,
                TimeUnit.SECONDS);


        schedule.scheduleAtFixedRate( () -> System.out.println("Tack executed after every  5 Secoends !.."),
                5,              // initialDelay
                5,          // period
                TimeUnit.SECONDS);


        schedule.scheduleWithFixedDelay( () -> System.out.println("Tack executed after in WithFixedDalay 2 Secoends !"),
                5,              // initialDelay
                2,          // delay
                TimeUnit.SECONDS);



        schedule.schedule( () -> {
            System.out.println("Initialing Shutdown..!");
                schedule.shutdown();
                },
                21,
                TimeUnit.SECONDS);
    }
}
