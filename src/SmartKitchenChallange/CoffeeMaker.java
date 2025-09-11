package SmartKitchenChallange;

public class CoffeeMaker  {

    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){

        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}
