package org.monteCarlo;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        Circle circle = new Circle();
        Random random = new Random();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0; i<10000000; i++){
            executorService.submit(new Integration(circle));
        }

        //executorService.awaitTermination(5, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println("O valor calcculado de PI é: " + circle.getPI());
    }

}
