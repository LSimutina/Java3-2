public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 48; //масса тела в кг
        double rost = 1.58; //рост тела в метрах

        double bodyMassIndex = service.calculate(mass, rost);
        String result = String.format("%.2f", bodyMassIndex); //округление до 2х знаков, после запятой
        System.out.println("Индекс массы тела: " + result);
    }
}