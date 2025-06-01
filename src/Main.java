public class Main {
    public static void main(String[] args) {
       Car car = new  Car();

//       car.make = "Porche";
//       car.model = "Carrera";
//       car.color = "White";

        System.out.println("Make is " + car.getMake());
        System.out.println("Model is " + car.getModel());
        System.out.println("Color is " + car.getColor());

        //car.describeCar();
    }
}