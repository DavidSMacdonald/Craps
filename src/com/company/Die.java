package com.company;
public class Die {

    private int numDots;

    public Die() {
        int numDots;
    }

    public int getNumDots() {
        return numDots;
    }

    public void roll() {
        int result = (int)((Math.random()*6)+1);
        numDots = result;
    }

    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}

