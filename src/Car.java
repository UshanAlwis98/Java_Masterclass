public class Car {

    private String make = "Tesla";
    private  String model = "Model X";
    private String color = "Red";
    private int doors = 4;
    private  boolean convirtable = false;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvirtable() {
        return convirtable;
    }

    public void setConvirtable(boolean convirtable) {
        this.convirtable = convirtable;
    }

    public void describeCar() {
        System.out.println( doors + "-Door " +
                            color + " " +
                            make + " " +
                            model + " " +
                            (convirtable ? "convertible" : ""));
    }


}
