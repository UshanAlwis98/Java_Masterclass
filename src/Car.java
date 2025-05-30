public class Car {

    private String make = "Tesla";
    private  String model = "Model X";
    private String color = "Red";
    private int doors = 4;
    private  boolean convirtable = true;


    public  String getMake(){
        return  make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvirtable() {
        return convirtable;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                            color + " " +
                make + " " +
                model + " " +
                (convirtable ? "convertible" : ""));
    }
}
