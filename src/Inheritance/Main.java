package Inheritance;

public class Main {
    public static void main(String [] args){
        Animal animall = new Animal("Generic Animal","Huge",400);
        doAnimalstuff(animall,"slow");
    }

    public static void doAnimalstuff(Animal animall , String speed){
        animall.makeNoise();
        animall.move(speed);
        System.out.println(animall);
    }
}
