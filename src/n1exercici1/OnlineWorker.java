package n1exercici1;

public class OnlineWorker extends Worker {

    private final int internetCost = 30;

    public OnlineWorker(String name, String surname, int hourCost) {
        super(name, surname, hourCost);
    }

    @Override
    public int calculateCost(int hours) {
        return super.calculateCost(hours)+internetCost;
    }


}
