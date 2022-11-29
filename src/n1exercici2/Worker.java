package n1exercici2;

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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
