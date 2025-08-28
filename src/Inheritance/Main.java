package Inheritance;

public class Main {
    public static void main(String [] args){
        Animal animall = new Animal("Generic Animal","Huge",400);
        doAnimalstuff(animall,"slow");

        Dog dog = new Dog();
        doAnimalstuff(dog,"Fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalstuff(yorkie,"Fast");

        Dog retriver = new Dog("Labrador Retriver",65,"Floppy","Swimmer");
        doAnimalstuff(retriver,"slow");
    }

    public static void doAnimalstuff(Animal animall , String speed){
        animall.makeNoise();
        animall.move(speed);
        System.out.println(animall);
        System.out.println("-----------------");
    }
}
