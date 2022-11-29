package n1exercici2;

public class OnlineWorker extends Worker {

    private final int internetCost = 30;

    public OnlineWorker(String name, String surname, int hourCost) {
        super(name, surname, hourCost);
    }

    @Override
    public int calculateCost(int hours) {
        return super.calculateCost(hours)+internetCost;
    }

    @Deprecated
    public void printName() {
        System.out.println(super.getName()+" "+super.getSurname());
    }

}
