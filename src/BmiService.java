public class BmiService {
    public double calculate(int mass, double rost) {
        double bodyMassIndex = mass / (rost * rost);
        return bodyMassIndex;

    }
}
