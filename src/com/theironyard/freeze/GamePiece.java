package com.theironyard.freeze;
import java.util.*;

public class GamePiece {

    //FIELDS
    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
    public int x;
    public int y;


    //CONSTRUCTOR
    public GamePiece (String name, String color) {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
        this.minX = 0;
        this.maxX = 100;
        this.minY = 0;
        this.maxY = 500;
    }

    //METHODS
    public int getPositionX() {
        System.out.println("Here's your current X position: " + positionX);
        return positionX;
    }

    public int getPositionY() {
        System.out.println("Here's your current Y position: " + positionY);
        return positionY;
    }

    public boolean isFrozen() {
        System.out.println("Currently frozen: " + frozen);
        return frozen;
    }

    public int getMinX() {
        System.out.println("X minimum boundary: " + minX);
        return minX;
    }

    public int getMaxX() {
        System.out.println("X maximum boundary: " + maxX);
        return maxX;
    }

    public int getMinY() {
        System.out.println("X minimum boundary: " + minY);
        return minY;
    }

    public int getMaxY() {
        System.out.println("X minimum boundary: " + maxY);
        return maxY;
    }


    //BEHAVIOR
    public int randomNumX() {
        Random x = new Random();
        return x.nextInt() % 100;
    }

    public int randomNumY() {
        Random y = new Random();
        return y.nextInt() % 500;
    }

    public void move() {
        if (frozen == true) {
            //do nothing
        } else {
            x = randomNumX();
            y = randomNumY();

            while (
                    ((x + this.positionX) > maxX) ||
                    ((y + this.positionY) > maxY) ||
                    ((x + this.positionX) < minX) ||
                    ((y + this.positionY) < minY)
            ){
                x = randomNumX();
                y = randomNumY();
            }

                this.positionX += x;
                System.out.println("Your are moving to the following position: " + this.positionX);

                this.positionY += y;
                System.out.println("Your are moving to the following position: " + this.positionY);
        }
    }

        public void freeze() {
            frozen = true;
        }

        public void unfreeze() {
            frozen = false;
        }
}


