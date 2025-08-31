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

        Dog Wolf = new Dog("Wolf",34);
        doAnimalstuff(Wolf,"slow");

        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalstuff(goldie,"fast");
    }

    public static void doAnimalstuff(Animal animal , String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----------------");
    }
}
