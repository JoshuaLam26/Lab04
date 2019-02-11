package ca.bcit.comp2522.lab03;

public class Ecosystem {

    public static void main(String[] args) {
        Eater eater;
        eater = new Cormorant();
        eater.eat();
        eater = new Human();
        eater.eat();
    }
}
