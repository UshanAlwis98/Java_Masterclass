package Inheritance;

public class Main {
    public static void main(String [] args){
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalstuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalstuff(dog,"Fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalstuff(yorkie,"Fast");

        Dog retriver = new Dog("Labrador Retriver",65,"Floppy","Swimmer");
        doAnimalstuff(retriver,"slow");
    }

    public static void doAnimalstuff(Animal animal , String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----------------");
    }
}
