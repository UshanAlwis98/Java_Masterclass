public class Car {

    private String make;
    private  String model;
    private String color;
    private int doors;
    private  boolean convirtable;

    public void describeCar() {
        System.out.println(doors + "-Door" +
                            color + " " +
                make + " " +
                model + " " +
                (convirtable ? "Convirtable" : ""));
    }
}
