public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massa = 98;  // масса в кг
        double rost = 1.87; // рост в метрах
        int index = service.calculate(massa, rost);


        System.out.println(index);
        System.out.println(service.calculate(90, 1.80));
    }
}