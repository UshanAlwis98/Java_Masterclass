public class Main {
    public static void main(String[] args) {
       Car car = new  Car();

        car.setMake("Ferrari");
        System.out.println("Make is = " + car.getMake());

        car.setModel("Monza Sprider");
        System.out.println("Model is = " + car.getModel());

        car.setColor("Light grey");
        System.out.println("Color is = " + car.getColor());

        car.setDoors(7);
        System.out.println(car.getDoors() + " -doors");

        car.setConvertible(true);
        System.out.println("This car is " + car.isConvertible());

//        car.describeCar();
    }
}