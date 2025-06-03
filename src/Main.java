public class Main {
    public static void main(String[] args) {
       Car car = new  Car();

        System.out.println("Make is = " + car.getMake());
        System.out.println("Model is = " + car.getModel());
        System.out.println("Color is = " + car.getColor());
        System.out.println(car.getDoors() + " -doors");
        System.out.println("This car is " + car.isConvirtable());

//        car.describeCar();
    }
}