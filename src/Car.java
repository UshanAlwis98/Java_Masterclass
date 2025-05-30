public class Car {

    private String make = "Benz";
    private  String model = "C class";
    private String color = "Black";
    private int doors;
    private  boolean convirtable;

    public void describeCar() {
        System.out.println(doors + "-Door " +
                            color + " " +
                make + " " +
                model + " " +
                (convirtable ? "convertible" : ""));
    }
}
