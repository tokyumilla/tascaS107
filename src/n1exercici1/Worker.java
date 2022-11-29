package n1exercici1;

public class Worker {
    private String name;
    private String surname;
    private int hourCost;

    public int calculateCost (int hours) {
       return hours*hourCost;
    }

    public Worker(String name, String surname, int hourCost) {
        this.name = name;
        this.surname = surname;
        this.hourCost = hourCost;
    }
}
