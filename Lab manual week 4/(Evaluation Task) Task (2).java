/*******************************************************************************
 * Task 2

Design a class Cannonball to model a cannonball that is fired into the air.
A ball has
• An x- and a y-position.
• An x- and a y-velocity.
Supply the following methods:
• A constructor with an x-position (the y-position is initially 0)
• A method move(double sec) that moves the ball to the next position (First compute the distance traveled in
sec seconds, using the current velocities, then update the x- and y-positions; then update the y-velocity by
taking into account the gravitational acceleration of –9.81 m/s2; the x-velocity is unchanged.)
• Methods getX and getY that get the current location of the cannonball
• A method shoot whose arguments are the angle a and initial velocity v (Compute the x-velocity as v cos a
and the y-velocity as v sin a; then keep calling move with a time interval of 0.1 seconds until the y-position is
0; call getX and getY after every move and display the position.)
Use this class in a program that prompts the user for the starting angle and the initial velocity. Then call shoot().

 ********************************************************************************/


import java.util.Scanner;

class Cannonball {
    double velocity, position;
    Cannonball(double velocity) {
        this.velocity = velocity;
    }
    void move() {
        this.position += this.velocity * 0.01;
        this.velocity = this.velocity - 9.81 * 0.01;
    }
    double getX() {
        return this.position;
    }
    double getY() {
        return this.velocity;
    }
    void shoot(double initVelocity) {
        System.out.println("On x-axis     On y-axis     On z-axis ");
        for (int i = 0; this.position >= 0; i++) {
            if (i % 100 == 0) {
                System.out.printf("  %.2f        %.2f          ",this.getX(),this.getY());
                System.out.printf("%.2f\n",(-0.5 * 9.81 * Math.pow( i / 100, 2) + initVelocity * i / 100));
            }
            this.move();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter initVelocity here ....");
        double initVelocity = obj.nextDouble();
        Cannonball c = new Cannonball(initVelocity);
        c.shoot(initVelocity);
    }
}

