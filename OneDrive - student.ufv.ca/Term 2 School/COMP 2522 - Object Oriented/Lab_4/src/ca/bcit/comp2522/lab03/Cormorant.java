package ca.bcit.comp2522.lab03;

public class Cormorant implements Aerial, Aquatic, Terrestrial, Eater {

    public void swim() {
        System.out.println("Dive!");
    }

    public void fly() {
        System.out.println("Swoop");
    }

    public void walk() {
        System.out.println("Hop!");
    }

    public void eat() {
        System.out.println("Eat a fish!");
    }
}
