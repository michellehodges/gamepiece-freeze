package com.theironyard.freeze;

public class Main {

    public static void main(String[] args) {

        GamePiece newGame = new GamePiece ( "michelle", "blue");

        newGame.getPositionX();
        newGame.getPositionY();
        newGame.isFrozen();
        newGame.getMinX();
        newGame.getMaxX();
        newGame.getMinY();
        newGame.getMaxY();

        newGame.move();

        newGame.getPositionX();
        newGame.getPositionY();
        newGame.isFrozen();
        newGame.getMinX();
        newGame.getMaxX();
        newGame.getMinY();
        newGame.getMaxY();

        newGame.freeze();
        newGame.move();

        newGame.getPositionX();
        newGame.getPositionY();
        newGame.isFrozen();
        newGame.getMinX();
        newGame.getMaxX();
        newGame.getMinY();
        newGame.getMaxY();

        newGame.unfreeze();
        newGame.move();

    }
}




