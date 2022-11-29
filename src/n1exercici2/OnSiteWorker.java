package n1exercici2;

public class OnSiteWorker extends Worker {
    private static int gas = 40;

    public OnSiteWorker(String name, String surname, int hourCost) {
        super(name, surname, hourCost);
    }

    @Override
    public int calculateCost(int hours) {
        return super.calculateCost(hours)+gas;
    }

    @Deprecated
    public int calculateGas (int kilometers) {
        return kilometers*gas;
    }
}
