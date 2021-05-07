package org.monteCarlo;

public class Circle {
    int pointsInside = 0;
    int totalPoints = 0;

    public synchronized void addPointInside() {
        this.pointsInside++;
        //System.out.println(this.pointsInside);
        notify();
    }

    public synchronized void addTotalPoints() {
        this.totalPoints++;
        notify();
    }

    public double getPI(){
        return (double)4* ((double)this.pointsInside/(double)this.totalPoints);
    }
}
