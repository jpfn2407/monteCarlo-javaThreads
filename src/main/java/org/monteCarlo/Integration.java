package org.monteCarlo;

public class Integration extends Thread{
    private final Circle circle;

    public Integration(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void run() {
        double x = (Math.random())-1; //intervalo de -1 a 1
        double y = (Math.random())-1;
        double z = x*x + y*y;
        if(z<=1){
            circle.addPointInside();
        }
        circle.addTotalPoints();
    }
}
