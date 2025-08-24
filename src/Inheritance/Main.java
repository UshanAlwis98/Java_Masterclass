package Inheritance;

public class Main {
    public static void main(String [] args){
        Animal animal = new Animal();

    }

    public static void doAnimalstuff(Animal animall , String speed){
        animall.makeNoise();
        animall.move("High");
    }
}
