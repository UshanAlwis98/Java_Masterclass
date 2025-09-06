package InheritanceandComposition;

public class PersonalComputer extends Product {

    private Monitor monitor;
    private Motherboard motherboard;
    private Computercase computercase;

    public PersonalComputer(String model, String manufacture, Monitor monitor, Motherboard motherboard, Computercase computercase) {
        super(model, manufacture);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computercase = computercase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Computercase getComputercase() {
        return computercase;
    }
}
