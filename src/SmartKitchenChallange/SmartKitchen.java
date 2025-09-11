package SmartKitchenChallange;

public class SmartKitchen {

    private CoffeeMaker brewmaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewmaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewmaster() {
        return brewmaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){

    }

    public void pourMilk(){

    }

    public void loadDishwasher(){

    }

    public void setKitchenState(){

    }

    public void doKitchenWork(){

    }
}
