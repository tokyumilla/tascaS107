package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Pepe", "Sánchez", 15);
        OnlineWorker worker2 = new OnlineWorker("Francisco", "Olaya", 15);
        OnSiteWorker worker3 = new OnSiteWorker("Josefa", "Cuenca", 15);

        System.out.println("El sueldo de Pepe es: " + worker1.calculateCost(160));
        System.out.println("El sueldo de Francisco es: " + worker2.calculateCost(160));
        System.out.println("El sueldo de Josefa es: " + worker3.calculateCost(160));
        //Todos tienen el mismo sueldo/hora y las mismas horas trabajadas, pero el sueldo final es diferente

    }
}