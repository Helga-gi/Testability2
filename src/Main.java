public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        System.out.println("Укажите рост в метрах: ");
        int weight = 98;
        System.out.println("Укажите вес в килограммах: ");
        int bmi = service.calculate(height, weight);

        System.out.println("Индекс: " + bmi);
    }
}