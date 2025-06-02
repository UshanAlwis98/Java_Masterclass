public class Car {

    private String make = "Tesla";
    private  String model = "Model X";
    private String color = "Red";
    private int doors = 4;
    private  boolean convirtable = true;




    public void describeCar() {
        System.out.println( doors + "-Door " +
                            color + " " +
                            make + " " +
                            model + " " +
                            (convirtable ? "convertible" : ""));
    }


}
