package ca.bcit.comp2522.lab03;

public class Human implements Terrestrial, Aquatic, Eater {

    public void swim() {
        System.out.println("Cannon ball!");
    }

    public void walk() {
        System.out.println("Run!");
    }

    public void eat() {
        System.out.println("Eat a steak!");
    }
}
