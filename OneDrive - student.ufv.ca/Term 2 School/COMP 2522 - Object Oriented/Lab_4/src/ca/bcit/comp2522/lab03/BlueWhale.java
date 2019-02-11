package ca.bcit.comp2522.lab03;

public class BlueWhale implements Aquatic, Comparable<BlueWhale>, Eater {

    private double length;

    public BlueWhale(double newLength) {
        length = newLength;
    }

    public void swim() {
        System.out.println("Dive deeper!");
    }

    public void eat() {
        System.out.println("Eat some krill!");
    }

    @Override
    public int compareTo(BlueWhale blueWhale) {
        if (length > blueWhale.length) return 1;
        else if (length < blueWhale.length) return -1;
        else return 0;
    }

}
