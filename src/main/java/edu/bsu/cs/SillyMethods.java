package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int guess) {

        if(guess == 42){
            return true;
    }

        return false;
    }

    public String countTo(int countTo) {

        String countTo10 = "0 1 2 3 4 5 6 7 8 9 10";
        String countTo15 = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";

        if (countTo == 10){
            return countTo10;
        }

        if (countTo == 15){
            return countTo15;

        }

        return null;
    }
}
